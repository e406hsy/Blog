package com.soonyong.hong.web.services;

import com.soonyong.hong.web.dto.MyUserDetails;
import com.soonyong.hong.web.entity.User;
import com.soonyong.hong.web.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username).orElseThrow(() -> new UsernameNotFoundException("failed to find user name : " + username));
        
        MyUserDetails userDetail = new MyUserDetails(user);

        return userDetail;
    }
    
}