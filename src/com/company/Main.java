package com.company;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("Canis familiaris");
        dog.name = "Szarik";
        Car audi = new Car("Audi", "A3", 12051.0);
        Phone iphone = new Phone("apple", "S6", "iOS", 4.5);
        System.out.println("producer = " + iphone.producer);
        System.out.println("name = " + dog.name);

        Human me = new Human(1002.0);
        Double mySalary = me.getSalary();
        me.setSalary(2000.0);
        me.setCar(audi);


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
