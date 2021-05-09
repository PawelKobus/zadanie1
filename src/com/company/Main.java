package com.company;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("Canis familiaris");
        dog.name = "Szarik";
        Car audi = new Car("Audi", "A3");
        Phone iphone = new Phone("apple", "S6", "iOS", 4.5);

        System.out.println("producer = " + iphone.producer);
        System.out.println("name = " + dog.name);

        Human me = new Human(1000.0);
        Double mySalary = me.getSalary();
        me.setSalary(2000.0);



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
