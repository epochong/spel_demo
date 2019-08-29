package com.ming.vo;

public class Car {

    private String brand;

    private int price;

    //轮胎周长
    private int tyreMeter;

    public Car(){

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTyreMeter() {
        return tyreMeter;
    }

    public void setTyreMeter(int tyreMeter) {
        this.tyreMeter = tyreMeter;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", tyreMeter=" + tyreMeter +
                '}';
    }
}
