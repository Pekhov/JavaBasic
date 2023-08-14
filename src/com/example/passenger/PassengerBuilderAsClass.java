package com.example.passenger;

/**
 * @author Pekhov A.V.
 * @created 31/08/2021 - 07:30
 */

public class PassengerBuilderAsClass {

    Passenger passenger = new Passenger();

    public PassengerBuilderAsClass setName(String name) {
        passenger.name = name;
        return this;
    }

    public PassengerBuilderAsClass setAge(int age) {
        passenger.age = age;
        return this;
    }

    public Passenger build() {
        return passenger;
    }

    public String toString() {
        return "Passenger name: " + passenger.name;
    }
}
