package com.company.devices;

public abstract class Diesel extends Car
{
    public Diesel(String producer, String model, Double value, Integer yearOfProduction) {
        super(producer, model, value, yearOfProduction);
    }

    @Override
    public void refuel() {

    }
}
