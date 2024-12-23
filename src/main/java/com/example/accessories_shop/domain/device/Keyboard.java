package com.example.accessories_shop.domain.device;

public class Keyboard implements Device{
    private Long id;
    private String name;
    private double price;
    private String description;

    public Keyboard(String name, double price) {
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
        return "Keyboard";
    }
}
