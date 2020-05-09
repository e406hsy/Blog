package com.soonyong.hong.web.mapper;

import com.soonyong.hong.web.model.User;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper{
    User getUserByUserName(String userName);
    User getUserById(long id);
    int insert(User user);
}