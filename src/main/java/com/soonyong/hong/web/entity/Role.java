package com.soonyong.hong.web.entity;

import java.util.Optional;
import java.util.Arrays;

public enum Role {
    USER("USER"), ADMIN("ADMIN");

    private String role;

    Role(String role) {
        this.role = role;
    }

    public static Optional<Role> getRoleByOrder(int order) {
        return Arrays.stream(Role.values()).filter((role) -> {
            return role.ordinal() == order;
        }).findAny();
    }
}
