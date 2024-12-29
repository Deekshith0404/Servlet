package com.xworks.formsexampl.dto;

public class MuseumFormDto {
    private String name;
    private int numOfAdults;
    private int numOfChildren;
    private long mobileNumber;
    private String email;
    private double price;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MuseumFormDto(String name, int numOfAdults, int numOfChildren, long mobileNumber, String email, double price) {
        this.name = name;
        this.numOfAdults = numOfAdults;
        this.numOfChildren = numOfChildren;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.price=price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfAdults() {
        return numOfAdults;
    }

    public void setNumOfAdults(int numOfAdults) {
        this.numOfAdults = numOfAdults;
    }

    public int getNumOfChildren() {
        return numOfChildren;
    }

    public void setNumOfChildren(int numOfChildren) {
        this.numOfChildren = numOfChildren;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "MuseumFormDto{" +
                "name='" + name + '\'' +
                ", numOfAdults=" + numOfAdults +
                ", numOfChildren=" + numOfChildren +
                ", mobileNumber=" + mobileNumber +
                ", email='" + email + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}
