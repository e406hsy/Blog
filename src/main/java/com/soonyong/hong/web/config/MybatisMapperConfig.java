package com.soonyong.hong.web.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("mybatis")
@MapperScan(basePackages = "com.soonyong.hong.web.mapper")
public class MybatisMapperConfig {
}