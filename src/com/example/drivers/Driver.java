package com.example.drivers;

import java.util.HashMap;
import java.util.Map;

public class Driver {
    public static HashMap<String, String> drivers = new HashMap<String, String>(); // Создали коллекцию

    public Driver(String surename, String name) {
        drivers.put(surename, name); // добавили в коллекцию хэш
    }

    public static void showDrivers() {
        for(Map.Entry<String, String> entry: drivers.entrySet()) { // цикл для вывода хэша
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Фамилия: " + key + "\n" + "Имя: " + value);
        }
    }
}
