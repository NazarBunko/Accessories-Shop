package com.example.accessories_shop.web.dto.device;

import com.example.accessories_shop.domain.device.Status;
import com.example.accessories_shop.web.dto.validation.OnCreate;
import com.example.accessories_shop.web.dto.validation.OnUpdate;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
public class DeviceDto {

    @NotNull(message = "Id must be not null.", groups = OnUpdate.class)
    private Long id;

    @NotNull(message = "Name must be not null.", groups = {OnCreate.class, OnUpdate.class})
    @Length(max = 255, message = "Name Length must be smaller then 255 symbols", groups = {OnCreate.class, OnUpdate.class})
    private String name;

    @NotNull(message = "Price must be not null.", groups = {OnCreate.class, OnUpdate.class})
    private double price;

    @Length(max = 255, message = "Description Length must be smaller then 255 symbols", groups = {OnCreate.class, OnUpdate.class})
    private String description;

    private Status status;

    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime expirationDate;

}
