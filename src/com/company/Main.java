package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("Canis familiaris");
        dog.name = "Szarik";
        Car audi = new Car("Audi", "A3", 12051.0);
        Car fiat = new Car("Audi", "A3", 12051.0);
        Phone iphone = new Phone("apple", "S6", "iOS", 4.5);
        System.out.println("producer = " + iphone.producer);
        System.out.println("name = " + dog.name);
        Human me = new Human(1002.0);
        Double mySalary = me.getSalary();
        me.setSalary(2000.0);
        me.setCar(audi);


        System.out.println((me.firstName));
        System.out.println((me.lastName));
        System.out.println((me.Age));
        System.out.println((me.getCar()));

        System.out.println(new Car("Audi", "A3", 12051.0).equals(new Car("Audi", "A3", 12051.0)));
        System.out.println(audi);
        System.out.println(fiat);
        System.out.println(dog);
        System.out.println(iphone);
        System.out.println(me);

        /*dog.feed();
        dog.takeForAWalk();
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();*/



    }
}
