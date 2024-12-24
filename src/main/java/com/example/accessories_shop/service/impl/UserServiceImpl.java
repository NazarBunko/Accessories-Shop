package com.example.accessories_shop.service.impl;

import com.example.accessories_shop.domain.user.User;
import com.example.accessories_shop.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public User getByUsername(String username) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public boolean isDeviceInBasket(Long userId, Long deviceId) {
        return false;
    }

    @Override
    public void delete(Long id) {

    }
}
