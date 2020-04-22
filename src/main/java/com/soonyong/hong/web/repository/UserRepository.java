package com.soonyong.hong.web.repository;

import com.soonyong.hong.web.dto.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    
}