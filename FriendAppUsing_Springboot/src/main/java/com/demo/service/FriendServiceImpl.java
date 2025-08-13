package com.demo.service;

import com.demo.entity.FriendEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FriendServiceImpl implements FriendService {

    private final FriendRepository friendRepository;

    @Autowired
    public FriendServiceImpl(FriendRepository friendRepository){
        this.friendRepository = friendRepository;
    }

    @Override
    public List<FriendEntity> getAllFriends() {
        return friendRepository.findAll();
    }

    @Override
    public Optional<FriendEntity> getFriendById(Long id) {
        return friendRepository.findById(id);
    }

    @Override
    public FriendEntity createFriend(FriendEntity friend) {
        return friendRepository.save(friend);
    }

    @Override
    public FriendEntity updateFriend(Long id, FriendEntity friend) {
        return friendRepository.findById(id).map(existingFriend -> {
            existingFriend.setName(friend.getName());
            existingFriend.setEmail(friend.getEmail());
            return friendRepository.save(existingFriend);
        }).orElseThrow(() -> new RuntimeException("Friend not found with id " + id));
    }

    @Override
    public void deleteFriend(Long id) {
        friendRepository.deleteById(id);
    }
}

