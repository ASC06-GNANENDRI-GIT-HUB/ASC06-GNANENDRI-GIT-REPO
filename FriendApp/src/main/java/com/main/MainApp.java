package com.main;

import com.menu.Menu;
import com.repository.DatabaseConnection;

import static java.awt.SystemColor.menu;

public class MainApp {
    public static void main(String[] args) {
        DatabaseConnection.init();  // Initialize DB connection
        Menu.displayMenu();         // Start the menu
        DatabaseConnection.close(); // Close DB connection on exit
    }
}

