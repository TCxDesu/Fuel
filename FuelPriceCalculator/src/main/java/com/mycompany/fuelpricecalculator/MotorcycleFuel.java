package com.mycompany.fuelpricecalculator;

public class MotorcycleFuel extends Fuel {

    public void displayInfo(String fuel, double price, double litre) {
        if (fuel.equalsIgnoreCase("P")) {
            fuel = "Premium";
        } else if (fuel.equalsIgnoreCase("D")) {
            fuel = "Diesel";
        }

        System.out.println("Vehicle Type: Motorcycle");
        System.out.println("Fuel Type: " + fuel);
        System.out.printf("Fuel Price per Litre: %,.2f", price);
        System.out.println("");
        System.out.printf("Litres Ordered:  %,.2f", litre);
        System.out.println("");
        System.out.println("===============================================");
        System.out.printf("Total Price:  %,.2f", computePrice(price, litre));
        System.out.println("");
    }
}
