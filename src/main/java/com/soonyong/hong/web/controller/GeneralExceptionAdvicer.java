package com.soonyong.hong.web.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class GeneralExceptionAdvicer {
    @ExceptionHandler(Exception.class)
    public String error(Exception e) {
        log.error("unhandled exception", e);
        return "index";
    }
}