package com.company.devices;

import com.company.creatures.Human;

import java.util.Arrays;

public abstract class Car extends Device implements salleable
{
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
    public Double fuel;

    public Car(String producer, String model, Double value, Integer productionYear) {
        super(producer, model, productionYear);
        this.producer = producer;
        this.model = model;
        this.setValue(value);
    }
    public Integer getProductionYear(){
        return productionYear;
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
        System.out.println("Otwieram samochod");
        System.out.println("Kluczyk w stacyjkę");
        System.out.println("Kręcę");
        System.out.println("Odpalił");

    }
    @Override
    public void sell(Human seller, Human buyer, Double price, Integer parkNumber) throws Exception{
        if(!seller.haveCar(this)){
            throw new Exception("Nie ma auta");
        }
        if(!buyer.haveFreeSpace(this))
        {
            throw new Exception("Brak miejsca");
        }
        if(buyer.getCash() <price ){
            throw new Exception("Brak pieniedzy");
        }
        seller.removeCar(this);
        buyer.addCar(this);
        seller.setCash(seller.getCash()+price);
        buyer.setCash(buyer.getCash()-price);
        System.out.println("Sprzedano samochod");
    }
    public abstract void refuel();

}
