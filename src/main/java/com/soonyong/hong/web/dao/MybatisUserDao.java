package com.soonyong.hong.web.dao;

import java.util.Optional;

import com.soonyong.hong.web.mapper.UserMapper;
import com.soonyong.hong.web.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("mybatis")
@Component
public class MybatisUserDao implements UserDao {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Optional<User> getUserByid(long id) {
        return Optional.ofNullable(userMapper.getUserById(id));
    }

    @Override
    public Optional<User> getUserByUserName(String userName) {
        return Optional.ofNullable(userMapper.getUserByUserName(userName));
    }

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }
}