package com.soonyong.hong.web.services;

import com.soonyong.hong.web.entity.User;
import com.soonyong.hong.web.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserRepository userRepository;
    public void register(String userName, String password){
        String encryptedPassword = passwordEncoder.encode(password);

        User newUser = new User(userName, encryptedPassword);
        userRepository.save(newUser);
    }
}