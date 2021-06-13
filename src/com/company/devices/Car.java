package com.company.devices;

import com.company.creatures.Human;

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
        System.out.println("Otwieram samochod");
        System.out.println("Kluczyk w stacyjkę");
        System.out.println("Kręcę");
        System.out.println("Odpalił");

    }
    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.getAnimal()!=null) {
            if (buyer.cash >= price) {
                buyer.car = seller.car;
                seller.car = null;
                buyer.cash = buyer.cash - price;
                seller.cash = seller.cash + price;
                System.out.println("Samochod sprzedany, zmiana wlasciciela, hajs zabrany");
            }
            else
            {
                System.out.println("Nie stać cie  na Samochod hm");
            }
        }
        else
        {
            System.out.println("Nie masz Samochodu");
        }
    }
    public abstract void refuel();
}
