package com.example.accessories_shop.service;

import com.example.accessories_shop.domain.device.Device;

import java.util.List;

public interface DeviceService{
    Device getById(Long id);

    List<Device> getAllByUserId(Long id);

    Device update(Device device);

    Device create(Device device, Long id);

    void delete(Long id);
}
