package com.ecz.repository;

import java.sql.*;

public class DatabaseConnection {
    private static Connection connection;

    public static void init() {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=Friend;trustServerCertificate=true";
        String user = "sa";
        String password = "sqlserver";

        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to SQL Server.");
        } catch (SQLException e) {
            System.err.println("Connection failed.");
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }

    public static void close() {
        try {
            if (connection != null) connection.close();
            System.out.println("Database connection closed.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

