package com.soonyong.hong.web.dao;

import java.util.Optional;

import com.soonyong.hong.web.model.User;

public interface UserDao {
    Optional<User> getUserByid(long id);
    Optional<User> getUserByUserName(String userName);
    void insert(User user);
}