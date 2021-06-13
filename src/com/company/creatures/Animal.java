package com.company.creatures;

import com.company.devices.salleable;

import java.io.File;

public abstract class Animal implements Feedable, salleable{
    final String species;
    public String name;
    private Double weight;
    File pic;
    public Human seller;

    static public final Double DEFAULT_ANIMAL_WEIGHT = 1.0;

    public Animal(String species) {
        this.species = species;

        switch (this.species) {
            case "dog":
                this.weight = 20.0;
                break;
            case "cat":
                this.weight = 2.0;
                break;
            case "cow":
                this.weight = 400.0;
                break;
            default:
                this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    public void feed() {
        if (this.weight <= 0) {
            System.out.println("too late:)");
        } else {
            this.weight += 1;
            System.out.println("thx for food: " + this.weight);
        }
    }

    public void takeForAWalk() {
        if (this.weight <= 0) {
            System.out.println("too late:)");
        } else {
            this.weight -= 1.0;
            System.out.println("thx for a walk: " + this.weight);
        }
    }

    public String toString(){//overriding the toString() method
        return species+" "+name+" "+weight;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.getAnimal()!=null) {
            if (buyer.cash >= price) {
                buyer.animal = seller.animal;
                seller.animal = null;
                buyer.cash = buyer.cash - price;
                seller.cash = seller.cash + price;
                System.out.println("Zwierzak sprzedany, zmiana wlasciciela, hajs zabrany");
            }
            else
            {
                System.out.println("Nie stać cie  na zwierzaka hm");
            }
        }
        else
        {
            System.out.println("Nie masz zwierzaka");
        }
    }
    public void FarmAnimal(){



    }
    public void Pet(){

    }

}
