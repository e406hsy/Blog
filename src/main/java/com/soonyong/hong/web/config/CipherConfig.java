package com.soonyong.hong.web.config;

import java.security.NoSuchAlgorithmException;

import com.soonyong.hong.web.util.CipherUtil;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CipherConfig {
    @Bean
    public CipherUtil cipherUtil() throws NoSuchAlgorithmException {
        return new CipherUtil(1024);
    }
}