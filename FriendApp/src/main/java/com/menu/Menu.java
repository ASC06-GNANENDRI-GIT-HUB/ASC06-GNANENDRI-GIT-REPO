package com.menu;


import com.security.FriendLogic;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);
    static FriendLogic logic = new FriendLogic();

    public static void displayMenu() {
        int choice;
        do {
            System.out.println("\n--- Friend App ---");
            System.out.println("1. Add Friend");
            System.out.println("2. View Friends");
            System.out.println("3. Update Friend");
            System.out.println("4. Delete Friend");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    logic.addFriend();
                    break;
                case 2:
                    logic.viewFriends();
                    break;
                case 3:
                    logic.updateFriend();
                    break;
                case 4:
                    logic.deleteFriend();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }
}


