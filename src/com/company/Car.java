package com.company;

import java.sql.SQLOutput;

public class Car {
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

    public Integer getVintageCar() {
        return vintageCar;
    }

    public void setVintageCar(Integer vintageCar) {
        this.vintageCar = vintageCar;
    }

    final String model;
    private Double value;
    Integer ID;
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

    public String toString(){//overriding the toString() method
        return producer+" "+model+" "+value;
    }
}
