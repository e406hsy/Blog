package com.soonyong.hong.web.util;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class CipherUtil {

    private PublicKey publicKey;
    private PrivateKey privateKey;

    public CipherUtil(int bitSize) throws NoSuchAlgorithmException {

        SecureRandom secureRandom = new SecureRandom();

        KeyPairGenerator gen;

        gen = KeyPairGenerator.getInstance("RSA");

        gen.initialize(1024, secureRandom);

        KeyPair keyPair = gen.genKeyPair();
        this.publicKey = keyPair.getPublic();
        this.privateKey = keyPair.getPrivate();
    }

    /**
     * 
     * Public Key로 RSA 암호화를 수행합니다.
     * 
     * @param plainText 암호화할 평문입니다.
     * @return
     * 
     */

    public String encryptRSA(String plainText)

            throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException,

            BadPaddingException, IllegalBlockSizeException {

        Cipher cipher = Cipher.getInstance("RSA");

        cipher.init(Cipher.ENCRYPT_MODE, publicKey);

        byte[] bytePlain = cipher.doFinal(plainText.getBytes());

        String encrypted = Base64.getEncoder().encodeToString(bytePlain);

        return encrypted;

    }

    /**
     * 
     * Private Key로 RAS 복호화를 수행합니다.
     *
     * 
     * 
     * @param encrypted  암호화된 이진데이터를 base64 인코딩한 문자열 입니다.
     * @return
     * 
     * @throws Exception
     * 
     */

    public String decryptRSA(String encrypted)
            throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException,
            BadPaddingException, IllegalBlockSizeException, UnsupportedEncodingException {

        Cipher cipher = Cipher.getInstance("RSA");

        byte[] byteEncrypted = Base64.getDecoder().decode(encrypted.getBytes());

        cipher.init(Cipher.DECRYPT_MODE, privateKey);

        byte[] bytePlain = cipher.doFinal(byteEncrypted);

        String decrypted = new String(bytePlain, "utf-8");

        return decrypted;

    }

}