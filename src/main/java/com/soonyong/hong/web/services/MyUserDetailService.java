package com.soonyong.hong.web.services;

import com.soonyong.hong.web.dao.UserDao;
import com.soonyong.hong.web.model.MyUserDetails;
import com.soonyong.hong.web.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserDao userDao;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.getUserByUserName(username).orElseThrow(() -> new UsernameNotFoundException("failed to find user name : " + username));
        
        MyUserDetails userDetail = new MyUserDetails(user);

        return userDetail;
    }
    
}