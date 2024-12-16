package com.xworks.formsexampl.dto;

public class SweetFormDto {
    private String shopName;
    private String sweetName;
    private String special;
    private double Quantity;

    public SweetFormDto(String shopName, String sweetName, String special, double quantity) {
        this.shopName = shopName;
        this.sweetName = sweetName;
        this.special = special;
        Quantity = quantity;
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
                '}';
    }
}
