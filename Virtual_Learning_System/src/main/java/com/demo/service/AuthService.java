package com.demo.service;

import com.demo.entity.LoginEntity;
import com.demo.exception.InvalidCredentialsException;
import com.demo.repository.LoginRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final LoginRepository loginRepository;

    public AuthService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public boolean authenticate(String loginId, String password) {
        return loginRepository.findById(loginId)
                .map(loginEntity -> loginEntity.getPassword().equals(password))
                .orElse(false);
    }
}

