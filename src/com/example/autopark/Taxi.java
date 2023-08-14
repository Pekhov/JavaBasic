package com.example.autopark;

import com.example.basic.CarType;
import com.example.basic.Cars;

public final class Taxi extends Cars { // final нельзя наследовать и переопределять
    public static final String NUMBER = "A000E777RUS"; // определение констант

    public Taxi(int currentSpeed) { // Конструктор с параметром
        this.setCurrentSpeed(currentSpeed);
    }
    public Taxi(CarType carType) { // Конструктор с параметром
        this.carType = carType;
    }

    public void setNumber(String number) { // Реализуем метод итерфейса
        if (number == null) {
            this.number = NUMBER;
        } else {
            this.number = number;
        }
    }

    public String getNumber() { // Реализуем метод итерфейса
        return this.number;
    }

}
