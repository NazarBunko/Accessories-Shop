package com.example.accessories_shop.web.controller;

import com.example.accessories_shop.domain.device.Device;
import com.example.accessories_shop.domain.user.User;
import com.example.accessories_shop.repository.UserRepository;
import com.example.accessories_shop.service.DeviceService;
import com.example.accessories_shop.service.UserService;
import com.example.accessories_shop.web.dto.device.DeviceDto;
import com.example.accessories_shop.web.dto.user.UserDto;
import com.example.accessories_shop.web.dto.validation.OnCreate;
import com.example.accessories_shop.web.dto.validation.OnUpdate;
import com.example.accessories_shop.web.mappers.DeviceMapper;
import com.example.accessories_shop.web.mappers.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
@Validated
public class UserController {

    private final UserService userService;
    private final DeviceService deviceService;

    private final UserMapper userMapper;
    private final DeviceMapper deviceMapper;

    @PutMapping
    public UserDto update(@Validated(OnUpdate.class) @RequestBody UserDto dto) {
        User user = userMapper.toEntity(dto);
        User updatedUser = userService.update(user);
        return userMapper.toDto(updatedUser);
    }

    @GetMapping("/{id}")
    public UserDto getById(@PathVariable Long id) {
        User user = userService.getById(id);
        return userMapper.toDto(user);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        userService.delete(id);
    }

    @GetMapping("/{id}/devices")
    public List<DeviceDto> getDevicesByUserId(@PathVariable Long id) {
        List<Device> devices = deviceService.getAllByUserId(id);
        return deviceMapper.toDto(devices);
    }

    @PostMapping("/{id}/devices")
    public DeviceDto createDevice(@PathVariable Long id, @Validated(OnCreate.class) @RequestBody DeviceDto dto) {
        Device device = deviceMapper.toEntity(dto);
        Device createdDevice = deviceService.create(device, id);
        return deviceMapper.toDto(createdDevice);
    }

}
