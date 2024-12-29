package com.example.accessories_shop.web.controller;

import com.example.accessories_shop.domain.device.Device;
import com.example.accessories_shop.service.DeviceService;
import com.example.accessories_shop.web.dto.device.DeviceDto;
import com.example.accessories_shop.web.dto.validation.OnUpdate;
import com.example.accessories_shop.web.mappers.DeviceMapper;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/devices")
@Validated
public class DeviceController {

    private final DeviceService deviceService;
    private final DeviceMapper deviceMapper;

    public DeviceController(DeviceService deviceService, DeviceMapper deviceMapper) {
        this.deviceService = deviceService;
        this.deviceMapper = deviceMapper;
    }

    @PutMapping
    public DeviceDto update(@Validated(OnUpdate.class) @RequestBody DeviceDto dto) {
        Device device = deviceMapper.toEntity(dto);
        Device updatedDevice = deviceService.update(device);
        return deviceMapper.toDto(updatedDevice);
    }

    @GetMapping("/{id}")
    public DeviceDto getById(@PathVariable Long id) {
        Device device = deviceService.getById(id);
        return deviceMapper.toDto(device);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        deviceService.delete(id);
    }

}
