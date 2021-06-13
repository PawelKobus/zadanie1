package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.devices.Car;
import com.company.devices.Phone;


public class Main{

    public static void main(String[] args) {
        Human me = new Human(200000.0);
        me.setSalary(200000.0);
        Double mySalary = me.getSalary();
        Human someone = new Human(200000.0);
        someone.cash = 1000.0;
        me.cash = 10000.0;
        Animal dog = new Animal("Canis familiaris"){
            @Override
            public void feed(Double foodWeight) {

            }
        };
        dog.name = "Szarik";

        Car audi = new Car("Audi","A3",200623.0,1999);
        Car fiat = new Car("Fiat","126p",10623.0,1979);
        Phone iphone = new Phone("IPhone","X", 2019, "IOS 15", 6.0);
        Phone xiaomi = new Phone("Xiaomi","11", 2018, "Android 10", 6.2);

        me.setCar(audi);
        me.setPhone(iphone);
        me.setAnimal(dog);




        System.out.println("name = " + dog.name);


        System.out.println((me.firstName));
        System.out.println((me.lastName));
        System.out.println((me.Age));
        System.out.println((me.getCar()));

        System.out.println(dog);
        System.out.println(me);


        audi.turnOn();
        iphone.turnOn();
        System.out.println(me.getPhone());
        System.out.println(me.getCar());
        System.out.println(me.getAnimal());
        System.out.println("\n");

        //sprzedanie zwierzaka
        System.out.println("hajs kupujacego: "+someone.cash);
        System.out.println("moj hajs: "+me.cash);
        System.out.println("zwierze kupujacego: "+someone.getAnimal());
        System.out.println("zwierze moje: "+me.getAnimal());
        me.animal.sell(me,someone,999.0);
        System.out.println("hajs kupujacego: "+someone.cash);
        System.out.println("moj hajs: "+me.cash);
        System.out.println("zwierze kupujacego: "+someone.getAnimal());
        System.out.println("zwierze moje: "+me.getAnimal());



    }
}
