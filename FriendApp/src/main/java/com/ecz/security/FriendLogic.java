package com.ecz.security;


import com.ecz.model.Friend;
import com.ecz.repository.FriendRepository;

import java.util.List;
import java.util.Scanner;

public class FriendLogic {
    FriendRepository repo = new FriendRepository();
    Scanner sc = new Scanner(System.in);

    public void addFriend() {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        String id = String.valueOf(repo.generateNewFriendID());
        Friend f = new Friend(id, name, email, phone);
        repo.insertFriend(f);
    }

    public void viewFriends() {
        List<Friend> list = repo.getAllFriends();
        for (Friend f : list) {
            System.out.printf("ID: %s | Name: %s | Email: %s | Phone: %s%n",
                    f.getId(), f.getName(), f.getEmail(), f.getPhone());
        }
    }

    public void updateFriend() {
        System.out.print("Enter Friend ID to update: ");
        String id = sc.nextLine();
        System.out.print("Enter New Name: ");
        String name = sc.nextLine();
        System.out.print("Enter New Email: ");
        String email = sc.nextLine();
        System.out.print("Enter New Phone: ");
        String phone = sc.nextLine();

        Friend f = new Friend(id, name, email, phone);
        repo.updateFriend(f);
    }

    public void deleteFriend() {
        System.out.print("Enter Friend ID to delete: ");
        String id = sc.nextLine();
        repo.deleteFriend(id);
    }
}

