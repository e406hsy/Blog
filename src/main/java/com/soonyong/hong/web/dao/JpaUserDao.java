package com.soonyong.hong.web.dao;

import java.util.Optional;

import com.soonyong.hong.web.model.User;
import com.soonyong.hong.web.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("JPA")
public class JpaUserDao implements UserDao {
    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<User> getUserByid(long id) {
        return userRepository.findById(id);
    }

    @Override
    public Optional<User> getUserByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

    @Override
    public void insert(User user) {
        userRepository.save(user);
    }

}