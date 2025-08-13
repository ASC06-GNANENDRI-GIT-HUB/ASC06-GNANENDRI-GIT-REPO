package com.demo.service;

import com.demo.entity.FriendEntity;

import java.util.List;
import java.util.Optional;

public interface FriendService {
    List<FriendEntity> getAllFriends();
    Optional<FriendEntity> getFriendById(Long id);
    FriendEntity createFriend(FriendEntity friend);
    FriendEntity updateFriend(Long id, FriendEntity friend);
    void deleteFriend(Long id);
}

