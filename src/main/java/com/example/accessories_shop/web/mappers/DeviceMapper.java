package com.example.accessories_shop.web.mappers;

import com.example.accessories_shop.domain.device.Device;
import com.example.accessories_shop.web.dto.device.DeviceDto;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface DeviceMapper {

    DeviceDto toDto(Device device);

    List<DeviceDto> toDto(List<Device> devices);

    Device toEntity(DeviceDto dto);

}
