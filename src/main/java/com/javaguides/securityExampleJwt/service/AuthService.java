package com.javaguides.securityExampleJwt.service;


import com.javaguides.securityExampleJwt.entity.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}
