package com.example.accessories_shop.service.impl;

import com.example.accessories_shop.service.AuthService;
import com.example.accessories_shop.web.dto.auth.JwtRequest;
import com.example.accessories_shop.web.dto.auth.JwtResponse;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public JwtResponse login(JwtRequest loginRequest) {
        return null;
    }

    @Override
    public JwtResponse refresh(String refreshToken) {
        return null;
    }
}
