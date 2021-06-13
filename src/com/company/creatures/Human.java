package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Date;

public class Human
{
    public String firstName;
    public String lastName;
    public Integer Age;
    String sex;
    public Phone phone;
    public Animal animal;
    Animal pet;
    public Double cash;
    Human seller;
    Human buyer;


    public Car car;

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
    public Car getCar(){
        return car;
    }
    public void setCar(Car car){
        if(car.getValue() < this.salary){
            System.out.println("udało się kupić za gotówkę iprzypisujemy samochód");
            this.car = car;
        }
        else if((car.getValue()/12) < this.salary){
            System.out.println("udało się kupić na kredyt (no trudno) iprzypisujemy samochód");
            this.car = car;
        }
        else{
            System.out.println("zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
        }
    }
    public void setPhone(Phone phone){
        this.phone = phone;
    }
    public Phone getPhone(){
        return phone;
    }
    public void setAnimal(Animal animal){
        this.animal = animal;
    }
    public Animal getAnimal(){
        return animal;
    }
    public String toString(){
        return firstName+" "+lastName+" "+Age;
    }

}