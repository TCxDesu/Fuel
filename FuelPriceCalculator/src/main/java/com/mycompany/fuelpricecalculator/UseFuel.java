package com.mycompany.fuelpricecalculator;

import java.util.Scanner;

public class UseFuel {

    public UseFuel() {
        Fuel f = new Fuel();
        Verification v = new Verification();

        Scanner in = new Scanner(System.in);
        String custName = "", vehicleType = "", gasChoice = "";
        double fuelLitresOrdered = 0, fuelCapacity = 0, fuelPrice = 0;
        boolean loop = true;

        System.out.println("===============================================");
        System.out.println("                Gasoline Station");
        System.out.println("===============================================");
        System.out.print("Enter your name >>: ");
        custName = in.nextLine();
        f.setName(custName);
        System.out.println("===============================================");
        while (loop) {
            System.out.println("Enter the type of vehicle");
            System.out.println("[M]otorcycle");
            System.out.println("[C]ar");
            System.out.println("=============================================="
                    + "=");

            System.out.print("Enter your choice >>: ");
            vehicleType = in.nextLine().toUpperCase();
            loop = v.VerifyVehicle(vehicleType);
        }
        System.out.println("===============================================");

        f.setType(vehicleType);
        fuelCapacity = v.checkVehicleType(f.getType());
        f.setCapacity(fuelCapacity);
        loop = true;

        while (loop) {
            System.out.println("Enter the type of fuel");
            System.out.println("[P]remium");
            System.out.println("[D]iesel");
            System.out.println("=============================================="
                    + "=");

            System.out.print("Enter your choice >>: ");
            gasChoice = in.nextLine().toUpperCase();
            loop = v.VerifyGasoline(gasChoice);
        }
        System.out.println("===============================================");
        fuelPrice = v.checkGasoline(gasChoice);
        f.setPrice(fuelPrice);
        loop = true;

        while (loop) {
            System.out.print("Enter how much litres you want to order: ");
            fuelLitresOrdered = in.nextDouble();
            
            loop = v.VerifyLitres(fuelLitresOrdered, fuelCapacity);
        }
        f.setOrder(fuelLitresOrdered);
        
        System.out.println("===============================================");
        System.out.println("                Order Form");
        System.out.println("===============================================");
        System.out.println("Customer Name: "+ f.getName());
        v.calculatePrice(f.getType(), gasChoice, f.getPrice(), 
                f.getOrder());

    }

    public static void main(String[] args) {
        UseFuel uf = new UseFuel();
    }
}
