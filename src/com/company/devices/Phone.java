package com.company.devices;

public class Phone extends Device{
    final String operationSystem;
    final Double screenSize;

    public Phone(String producer, String model, Integer yearOfProduction, String operationSystem, Double screenSize) {
        super(producer, model, yearOfProduction);
        this.operationSystem = operationSystem;
        this.screenSize = screenSize;
    }

    String getOSVersion(){
        return "4.23.1";
    }

    @Override
    public void turnOn() {

    }
}
