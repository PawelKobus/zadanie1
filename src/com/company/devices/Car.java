package com.company.devices;

public class Car extends Device{
    final String producer;

    public String getProducer() {
        return producer;
    }
    public String getModel() {
        return model;
    }

    public Integer getID(){
        return ID;
    }


    final String model;
    private Double value;
    Integer ID;

    public Car(String producer, String model, Double value, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return ID == car.ID &&
                producer.equals(car.producer);
    }
   /* @Override
    public int hashCode() {
        return ID;
    }*/

    @Override
    public void turnOn() {

    }
}
