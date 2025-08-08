package com.ecz.repository;


import com.ecz.model.Friend;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class FriendRepository {
    private Connection conn = DatabaseConnection.getConnection();

    public int generateNewFriendID() {
        int newId = 1;

        try {
            // Step 1: Connect to the database
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=FriendDB;encrypt=true;trustServerCertificate=true",
                    "sa", // username
                    "your_password" // password — replace with your real password
            );

            // Step 2: Create statement
            Statement statement = connection.createStatement();

            // Step 3: Run query
            ResultSet rs = statement.executeQuery("SELECT MAX(friend_id) AS max_id FROM friends");

            if (rs.next()) {
                String lastId = rs.getString("max_id");

                if (lastId != null && !lastId.trim().isEmpty()) {
                    newId = Integer.parseInt(lastId) + 1;
                } else {
                    System.out.println("No existing ID found. Starting from 1.");
                }
            }

            // Step 4: Close resources (good practice)
            rs.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            System.out.println("Error generating new friend ID: " + e.getMessage());
        }

        return newId;
    }

    public void insertFriend(Friend friend) {
        String sql = "INSERT INTO friends (id, Name, Email, Phone) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, friend.getId());
            ps.setString(2, friend.getName());
            ps.setString(3, friend.getEmail());
            ps.setString(4, friend.getPhone());
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
                        rs.getString("Phone")
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
            ps.setString(3, f.getPhone());
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

