package com.example.accessories_shop.service.impl;

import com.example.accessories_shop.domain.device.Device;
import com.example.accessories_shop.service.DeviceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService {

    @Override
    public Device getById(Long id) {
        return null;
    }

    @Override
    public List<Device> getAllByUserId(Long id) {
        return List.of();
    }

    @Override
    public Device update(Device device) {
        return null;
    }

    @Override
    public Device create(Device device) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
