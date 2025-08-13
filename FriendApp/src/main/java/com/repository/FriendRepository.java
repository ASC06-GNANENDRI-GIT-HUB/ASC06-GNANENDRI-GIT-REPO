package com.repository;


import com.model.Friend;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class FriendRepository {
    private Connection conn = DatabaseConnection.getConnection();

    public String generateNewFriendID() {
        String newId = "F001";

        try {
            // Step 1: Connect to the database
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=friend;encrypt=true;trustServerCertificate=true",
                    "sa",
                    "sqlserver"
            );

            // Step 2: Query max existing numeric part of the ID
            String query = "SELECT MAX(CAST(SUBSTRING(id, 2, LEN(id)) AS INT)) AS max_id " +
                    "FROM friends " +
                    "WHERE ISNUMERIC(SUBSTRING(id, 2, LEN(id))) = 1";

            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                int maxId = rs.getInt("max_id");
                int nextId = maxId + 1;
                newId = String.format("F%03d", nextId);  // e.g., F001, F010, F123
            }

            // Step 3: Close resources
            rs.close();
            stmt.close();
            connection.close();

        } catch (Exception e) {
            System.out.println("Error generating new friend ID: " + e.getMessage());
            e.printStackTrace();  // Optional: logs full stack trace
        }

        return newId;
    }


    public void insertFriend(Friend friend) {
        String sql = "INSERT INTO friends (id, Name, Email, Phone) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, friend.getId());
            ps.setString(2, friend.getName());
            ps.setString(3, friend.getEmail());
            ps.setLong(4, friend.getPhone());
            ps.executeUpdate();
            System.out.println("Friend added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Friend> getAllFriends() {
        List<Friend> list = new ArrayList<>();
        String sql = "SELECT * FROM Friends ORDER BY id";

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new Friend(
                        rs.getString("id"),
                        rs.getString("Name"),
                        rs.getString("Email"),
                        rs.getLong("Phone")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void updateFriend(Friend f) {
        String sql = "UPDATE Friends SET Name = ?, Email = ?, Phone = ? WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, f.getName());
            ps.setString(2, f.getEmail());
            ps.setLong(3, f.getPhone());
            ps.setString(4, f.getId());
            int rows = ps.executeUpdate();
            if (rows > 0) System.out.println("Friend updated.");
            else System.out.println("Friend ID not found.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteFriend(String id) {
        String sql = "DELETE FROM Friends WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, id);
            int rows = ps.executeUpdate();
            if (rows > 0) System.out.println("Friend deleted.");
            else System.out.println("Friend ID not found.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

