package com.xworks.formsexampl.dto;

public class MilkFormDto {

    private String brand;
    private String type;
    private int quantity;
    private double total;
    private int id;
    public MilkFormDto(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MilkFormDto(String brand, String type, int quantity, double total) {
        this.brand = brand;
        this.type = type;
        this.quantity = quantity;
        this.total=total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "MilkFormDto{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", quantity=" + quantity +
                ", total=" + total +
                ", id=" + id +
                '}';
    }
}
