package com.example.accessories_shop.domain.device;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Mouse implements Device {
    private Long id;
    private String name;
    private double price;
    private String description;
    private Status status;
    private LocalDateTime expirationDate;

    public Mouse(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getType() {
        return "Mouse";
    }
}
