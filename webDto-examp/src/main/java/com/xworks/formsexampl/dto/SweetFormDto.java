package com.xworks.formsexampl.dto;

public class SweetFormDto {
    private String shopName;
    private String sweetName;
    private String special;
    private double Quantity;
    private double price;

    public SweetFormDto(String shopName, String sweetName, String special, double quantity,double price) {
        this.shopName = shopName;
        this.sweetName = sweetName;
        this.special = special;
        this.Quantity = quantity;
        this.price=price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getSweetName() {
        return sweetName;
    }

    public void setSweetName(String sweetName) {
        this.sweetName = sweetName;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public double getQuantity() {
        return Quantity;
    }

    public void setQuantity(double quantity) {
        Quantity = quantity;
    }

    @Override
    public String toString() {
        return "SweetFormDto{" +
                "shopName='" + shopName + '\'' +
                ", sweetName='" + sweetName + '\'' +
                ", special='" + special + '\'' +
                ", Quantity=" + Quantity +
                ", price=" + price +
                '}';
    }
}
