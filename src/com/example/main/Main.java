package com.example.main;

import com.example.autopark.Taxi;
import com.example.basic.CarType;
import com.example.drivers.Driver;
import com.example.passenger.PassengerBuilderAsClass;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Taxi taxi = new Taxi(CarType.CAR); // Передали enum
        taxi.run();
        taxi.setNumber("A777AA777");
        System.out.println("Текущая скорость: " + taxi.getCurrentSpeed());
        System.out.println("Номер: " + taxi.getNumber());
        Driver driver = new Driver("Петров", "Вася");
        taxi.addDriver(driver);
        System.out.println("Водители машины: " + Arrays.toString(taxi.getDrivers().toArray()));
        Driver.showDrivers();
        /*PassengerBuilder passengerBuilder = new PassengerImpl();
        passengerBuilder
                .setAge(34)
                .setName("Alex")
                .build();
        System.out.println(passengerBuilder.toString());*/
        PassengerBuilderAsClass passenger = new PassengerBuilderAsClass();
        passenger.setAge(34).setName("Alex").build();
        System.out.println(passenger.toString());
    }

    public static void test() {
        double sum = 0;
        for(double i = 0; i < 10; sum = sum +i) {
            i+=0.1;
            System.out.println(i);
        }

    }
}