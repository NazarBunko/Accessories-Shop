package com.example.accessories_shop.repository;

import com.example.accessories_shop.domain.device.Device;

import java.util.List;
import java.util.Optional;

public interface DeviceRepository {

    Optional<Object> findById(Long id);

    List<Device> findAllByUserId(Long userId);

    void assignToUserById(Long deviceId, Long userId);

    void update(Device device);

    void create(Device device);

    void delete(Long id);
}
