package com.company;

public class Car {
    final String producer;
    final String model;
    private Double value;
    Integer vintageCar;

    public Car(String producer, String model, Double value) {
        this.producer = producer;
        this.model = model;
        this.setValue(value);
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
