package com.chiira.classes.car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 1_300_00.0, EngineType.PETROL);

        System.out.println(car);
    }
}
