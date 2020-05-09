package com.soonyong.hong.web.repository;

import java.util.Optional;

import com.soonyong.hong.web.model.User;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Profile("JPA")
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByUserName(String userName);
    
}