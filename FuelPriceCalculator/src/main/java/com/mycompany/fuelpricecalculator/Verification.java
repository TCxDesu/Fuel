package com.mycompany.fuelpricecalculator;

public class Verification extends Fuel {

    public Verification() {

    }

    public boolean VerifyLitres(double litresOrdered, double fuelCapacity) {
        if (litresOrdered > fuelCapacity) {
            System.out.println("=============================================="
                    + "=");
            System.out.println("Entered digit exceeds the maximum capacity "
                    + "(maximum capacity: " + fuelCapacity + ")");
            System.out.println("=============================================="
                    + "=");
            return true;
        } else {
            return false;
        }
    }

    public boolean VerifyVehicle(String selection) {
        if (selection.equalsIgnoreCase("M")
                || selection.equalsIgnoreCase("C")) {
            return false;
        } else {
            System.out.println("=============================================="
                    + "=");
            System.out.println("Selected Type of vehicle does not exist");
            System.out.println("=============================================="
                    + "=");
            return true;
        }
    }

    public boolean VerifyGasoline(String selection) {
        if (selection.equalsIgnoreCase("P")
                || selection.equalsIgnoreCase("D")) {
            return false;
        } else {
            System.out.println("=============================================="
                    + "=");
            System.out.println("Selected Type of fuel does not exist");
            System.out.println("=============================================="
                    + "=");
            return true;
        }
    }

    public double checkVehicleType(String vehicleType) {
        double capacity = 0;
        if (vehicleType.equalsIgnoreCase("M")) {
            capacity = 15;
        } else if (vehicleType.equalsIgnoreCase("C")) {
            capacity = 50;
        }
        return capacity;
    }

    public double checkGasoline(String gasChoice) {
        double price = 0;
        if (gasChoice.equalsIgnoreCase("P")) {
            price = 75.05;
        } else if (gasChoice.equalsIgnoreCase("D")) {
            price = 76.10;
        }
        return price;
    }
    
    public void calculatePrice(String choice, String fuel, double price, double litres){
        if (choice.equalsIgnoreCase("M")) {
            MotorcycleFuel mf = new MotorcycleFuel();
            mf.displayInfo(fuel, price, litres);
        }else if (choice.equalsIgnoreCase("C")) {
            CarFuel cf = new CarFuel();
            cf.displayInfo(fuel, price, litres);
        }
    }
}
