package com.example.accessories_shop.service;

import com.example.accessories_shop.web.dto.auth.JwtRequest;
import com.example.accessories_shop.web.dto.auth.JwtResponse;

public interface AuthService {

    JwtResponse login(JwtRequest loginRequest);

    JwtResponse refresh(String refreshToken);
}
