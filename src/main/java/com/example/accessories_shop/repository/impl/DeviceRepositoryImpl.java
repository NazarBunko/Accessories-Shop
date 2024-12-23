package com.example.accessories_shop.repository.impl;

import com.example.accessories_shop.domain.device.Device;
import com.example.accessories_shop.repository.DeviceRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DeviceRepositoryImpl implements DeviceRepository {

    @Override
    public Optional<Object> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Device> findAllByUserId(Long userId) {
        return List.of();
    }

    @Override
    public void assignToUserById(Long deviceId, Long userId) {

    }

    @Override
    public void update(Device device) {

    }

    @Override
    public void create(Device device) {

    }

    @Override
    public void delete(Long id) {

    }
}
