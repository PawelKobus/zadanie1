package com.company;

import java.util.Date;

public class Human {
    String firstName;
    String lastName;
    Integer Age;
    String sex;

    Phone mobilePhone;
    Animal pet;
    Car audi;

    private Double salary;

    public Human(Double salary) {
        this.salary = salary;
    }

    public Double getSalary() {
        System.out.println("pobrana wartosc wynagrodzenia " + this.salary);
        System.out.println("termin pobrania informacji:" + new Date());
        return salary;
    }
    public void setSalary( double salary){
        if(salary < 0.0){
            System.out.println("sr, nie za free");
        }
        else{
            System.out.println("nowe dane zostały wysłane do systemu księgowego");
            System.out.println("odebrać aneks do umowy od pani Hani z kadr");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
        }

    }


}