package com.company.devices;

public abstract class LPG extends Car
{
    public LPG(String producer, String model, Double value, Integer yearOfProduction) {
        super(producer, model, value, yearOfProduction);
    }

    @Override
    public void refuel() {

    }
}
