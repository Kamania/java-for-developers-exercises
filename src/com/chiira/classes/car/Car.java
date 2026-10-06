package com.chiira.classes.car;

import java.util.Objects;

public class Car {
    private String manufacturer;
    private double price;
    private String engine;

    public Car(String manufacturer, double price, String engine) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.engine = engine;
    }

    public Car() {
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(price, car.price) == 0 && Objects.equals(manufacturer, car.manufacturer) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, price, engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", engine='" + engine + '\'' +
                '}';
    }
}
