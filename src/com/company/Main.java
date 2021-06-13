package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("Canis familiaris");
        dog.name = "Szarik";

        System.out.println("name = " + dog.name);
        Human me = new Human(1002.0);
        Double mySalary = me.getSalary();
        me.setSalary(2000.0);
        Car audi = new Car("Audi","A3",200623.0,1999);
        me.setCar(audi);
        System.out.println((me.firstName));
        System.out.println((me.lastName));
        System.out.println((me.Age));
        System.out.println((me.getCar()));

        System.out.println(dog);
        System.out.println(me);

        dog.feed();
        dog.takeForAWalk();
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        System.out.println(audi.toString());



    }
}
