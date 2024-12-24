package com.example.accessories_shop.service;

import com.example.accessories_shop.domain.user.User;

public interface UserService {

    User getById(Long id);

    User getByUsername(String username);

    User update(User user);

    User create(User user);

    boolean isDeviceInBasket(Long userId, Long deviceId);

    void delete(Long id);
}
