package com.soonyong.hong.web.util;

import javax.persistence.AttributeConverter;

import com.soonyong.hong.web.entity.Role;

public class RoleConverter implements AttributeConverter<Role, Integer> {

    @Override
    public Integer convertToDatabaseColumn(Role attribute) {
        return attribute.ordinal();
    }

    @Override
    public Role convertToEntityAttribute(Integer dbData) {
        return Role.getRoleByOrder(dbData).get();
    }

}