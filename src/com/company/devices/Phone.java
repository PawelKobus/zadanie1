package com.company.devices;


import com.company.creatures.Human;


public class Phone extends Device implements salleable {
    final String operationSystem;
    final Double screenSize;
    public Human owner;
    public Human seller;

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
        System.out.println("Włączam telefon");
        System.out.println("Czekam");
        System.out.println("Działczy");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.getAnimal()!=null) {
            if (buyer.cash >= price) {
                buyer.phone = seller.phone;
                seller.phone = null;
                buyer.cash = buyer.cash - price;
                seller.cash = seller.cash + price;
                System.out.println("Telefon sprzedany, zmiana wlasciciela, hajs zabrany");
            }
            else
            {
                System.out.println("Nie stać cie  na Telefon hm");
            }
        }
        else
        {
            System.out.println("Nie masz Telefonu");
        }
    }
}
