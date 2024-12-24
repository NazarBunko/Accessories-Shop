package com.example.accessories_shop.domain.device;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Device {

    private Long id;
    private String name;
    private double price;
    private String description;
    private Status status;
    private LocalDateTime expirationDate;

}
