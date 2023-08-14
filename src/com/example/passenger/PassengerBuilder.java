package com.example.passenger;

/**
 * @author Pekhov A.V.
 * @created 31/08/2021 - 06:56
 */

public interface PassengerBuilder {
    PassengerBuilder setName(String name);
    PassengerBuilder setAge(int age);
    PassengerBuilder setCash(double cash);
    Passenger build();
}
