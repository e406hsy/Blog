package com.soonyong.hong.web.dto;

import java.util.Arrays;
import java.util.Collection;

import com.soonyong.hong.web.entity.User;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetails implements UserDetails {

    private static final long serialVersionUID = -7451629221029861914L;

    private long id;
    private String userName;
    private String password;
    private GrantedAuthority role;
    private boolean enabled;

    public MyUserDetails (User user) {
        this.userName = user.getUserName();
        this.password = user.getPassword();
        this.id = user.getId();
        this.role = new SimpleGrantedAuthority(user.getRole().name());
        this.enabled = user.isAllow();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(role);
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }
    
    public long getId() {
        return this.id;
    }

}