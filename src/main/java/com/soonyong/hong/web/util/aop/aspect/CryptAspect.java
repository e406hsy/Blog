package com.soonyong.hong.web.util.aop.aspect;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import com.soonyong.hong.web.util.CipherUtil;
import com.soonyong.hong.web.util.aop.annotation.Decryption;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CryptAspect {
    @Autowired
    private CipherUtil cipherUtil;

    @Before("@annotation(decryption)")
    public void decrypt(JoinPoint joinPoint, Decryption decryption) throws InvalidKeyException, NoSuchPaddingException,
            NoSuchAlgorithmException, BadPaddingException, IllegalBlockSizeException, UnsupportedEncodingException {
        Object[] arguments = joinPoint.getArgs();
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Parameter[] parameters = method.getParameters();

        int i;
        for (i=0; i< parameters.length; i++){
            String name = parameters[i].getName();
            if (decryption.paramName().equals(name)){
                arguments[i] = cipherUtil.decryptRSA((String) arguments[i]);
                return;
            }
        }
    }
}