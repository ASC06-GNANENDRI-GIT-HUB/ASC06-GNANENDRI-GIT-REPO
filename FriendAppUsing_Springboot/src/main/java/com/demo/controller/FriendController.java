package com.demo.controller;

import com.demo.entity.FriendEntity;
import com.demo.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/friends")
public class FriendController {

    private final FriendService friendService;

    @Autowired
    public FriendController(FriendService friendService){
        this.friendService = friendService;
    }

    // Get all friends
    @GetMapping
    public List<FriendEntity> getAllFriends() {
        return friendService.getAllFriends();
    }

    // Get friend by id
    @GetMapping("/{id}")
    public ResponseEntity<FriendEntity> getFriendById(@PathVariable Long id) {
        return friendService.getFriendById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Create new friend
    @PostMapping
    public FriendEntity createFriend(@RequestBody FriendEntity friend) {
        return friendService.createFriend(friend);
    }

    // Update friend
    @PutMapping("/{id}")
    public ResponseEntity<FriendEntity> updateFriend(@PathVariable Long id, @RequestBody FriendEntity friend) {
        try {
            FriendEntity updatedFriend = friendService.updateFriend(id, friend);
            return ResponseEntity.ok(updatedFriend);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete friend
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFriend(@PathVariable Long id) {
        friendService.deleteFriend(id);
        return ResponseEntity.noContent().build();
    }
}

