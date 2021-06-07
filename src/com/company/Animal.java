package com.company;

import java.io.File;

public class Animal {
    final String species;
    public String name;
    private Double weight;
    File pic;

    static public final Double DEFAULT_ANIMAL_WEIGHT = 1.0;

    Animal(String species) {
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
}
