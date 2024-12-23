package com.example.accessories_shop.repository.impl;

import com.example.accessories_shop.domain.user.Role;
import com.example.accessories_shop.domain.user.User;
import com.example.accessories_shop.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return Optional.empty();
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void create(User user) {

    }

    @Override
    public void insertUserRole(Long userId, Role role) {

    }

    @Override
    public boolean isDeviceInBasket(User user) {
        return false;
    }

    @Override
    public void delete(Long id) {

    }
}
