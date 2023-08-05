package com.sebastianrod.hackatoonapisebastian.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Encrypt {

    public Encrypt(){}

    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public String encrypt(String password){
        return passwordEncoder.encode(password);
    }

    public Boolean match(String encryptPassword, String password){
        return passwordEncoder.matches(password, encryptPassword);
    }


}
