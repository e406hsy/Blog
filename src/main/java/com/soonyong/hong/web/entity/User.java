package com.soonyong.hong.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long Id;
    @Column(name = "name")
    private String userName;
    @Column
    private String password;
    @Column(name="allowed_yn")
    private boolean isAllow;

    @Enumerated(EnumType.ORDINAL)
    private Role role;
}