package com.example.passenger;

/**
 * @author Pekhov A.V.
 * @created 31/08/2021 - 07:08
 */

public class PassengerImpl implements PassengerBuilder {
    Passenger passenger = new Passenger();

    @Override
    public PassengerBuilder setName(String name) {
        passenger.name = name;
        return this;
    }

    @Override
    public PassengerBuilder setAge(int age) {
        passenger.age = age;
        return this;
    }

    @Override
    public PassengerBuilder setCash(double cash) {
        passenger.cash = cash;
        return this;
    }

    @Override
    public Passenger build() {
        return passenger;
    }

    public String toString() {
        return "Passenger name: " + passenger.name;
    }
}
