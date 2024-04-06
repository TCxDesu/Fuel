package com.mycompany.fuelpricecalculator;

public class Fuel {

    private String custName;
    private String vehicleType;
    private double tankCapacity;
    private double fuelPrice;
    private double fuelLitresOrdered;

    public void setName(String custName) {
        this.custName = custName;
    }

    public void setType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public void setPrice(double fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    public void setOrder(double fuelLiterOrdered) {
        this.fuelLitresOrdered = fuelLiterOrdered;
    }

    public String getName() {
        return custName;
    }

    public String getType() {
        return vehicleType;
    }

    public double getCapacity() {
        return tankCapacity;
    }

    public double getPrice() {
        return fuelPrice;
    }

    public double getOrder() {
        return fuelLitresOrdered;
    }

    public double computePrice(double fuelPrice, double fuelOrdered) {
        double price = fuelPrice * fuelOrdered;
        return price;
    }
}
