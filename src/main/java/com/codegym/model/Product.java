package com.codegym.model;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantily;
    private String color;
    private String description;
    private int category;

    public Product(String name, double price, int quantily, String color, String description) {
        this.name = name;
        this.price = price;
        this.quantily = quantily;
        this.color = color;
        this.description = description;
    }

    public Product(int id, String name, double price, int quantily, String color, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantily = quantily;
        this.color = color;
        this.description = description;
    }

    public Product(String name, double price, int quantily, String color, String description, int category) {
        this.name = name;
        this.price = price;
        this.quantily = quantily;
        this.color = color;
        this.description = description;
        this.category = category;
    }

    public Product(int id, String name, double price, int quantily, String color, String description, int category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantily = quantily;
        this.color = color;
        this.description = description;
        this.category = category;
    }

    public Product() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantily() {
        return quantily;
    }

    public void setQuantily(int quantily) {
        this.quantily = quantily;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }
}