package com.example.basic;

import com.example.drivers.Driver;

import java.util.ArrayList;
import java.util.List;

public abstract class Cars implements CarDesign{
    private int currentSpeed;
    protected String number;
    private List<Driver> drivers = new ArrayList<Driver>(); // Коллекция реализует интерфейс List, можно написать ArrayList
    public CarType carType;

    public Cars() { // Конструктор по умолчанию
        this.currentSpeed = 0;
    } // Конструкторы
    public Cars(int currentSpeed) { // Конструктор с параметром, вызовется, если есть параметры при создании объекта
        this.currentSpeed = currentSpeed;
    }
    public Cars(CarType carType) { // Конструктор с параметром
        this.carType = carType;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void run() {
        setCurrentSpeed(40);
    }
}
