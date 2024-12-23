package com.example.accessories_shop.repository;

import com.example.accessories_shop.domain.user.Role;
import com.example.accessories_shop.domain.user.User;

import java.util.Optional;

public interface UserRepository {

    Optional<User> findById(Long id);

    Optional<User> findByUsername(String username);

    void update(User user);

    void create(User user);

    void insertUserRole(Long userId, Role role);

    boolean isDeviceInBasket(User user);

    void delete(Long id);
}
