package com.company;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("Canis familiaris");
        dog.name = "Szarik";

        Phone iphone = new Phone("apple","S6","iOS",4.5);

        System.out.println("producer = " + iphone.producer);
        System.out.println("name = " + dog.name);

        Human me = new Human();
        me.mobilePhone = iphone;
        dog.takeForAWalk();
    }
}
