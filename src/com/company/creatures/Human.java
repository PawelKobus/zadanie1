package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Device;
import com.company.devices.Phone;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

public class Human
{
    private static final int DEFAULT_GARAGE_SIZE = 4;
    public String firstName;
    public String lastName;
    public Integer Age;
    String sex;
    public Phone phone;
    public Animal animal;
    Animal pet;
    public Double cash = 0.0;
    Human seller;
    Human buyer;


    private Car garage[];


    private Double salary;

    public Human(Double salary) {
        this.salary = salary;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
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
    public Car getCar(Integer parkNumber){
        return this.garage[parkNumber];

   }
    public Car setCar(Car car, Integer parkNumber){
        if(car.getValue() < this.salary){
            System.out.println("udało się kupić za gotówkę iprzypisujemy samochód");
            this.garage[parkNumber] = car;
        }
        else if((car.getValue()/12) < this.salary){
            System.out.println("udało się kupić na kredyt (no trudno) iprzypisujemy samochód");
            this.garage[parkNumber ] = car;
        }
        else{
            System.out.println("zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
        }
        return car;
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
    public Double getCash(){
        return cash;
    }
    public void setCash(Double price)
    {
        this.cash = cash;
    }

    public boolean haveCar(Car car) {
        for(int i = 0; i<this.garage.length; i++){
            if(car==this.garage[i])
                return true;
        }
        return false;
    }

    public boolean haveFreeSpace(Car car) {
        for(int i = 0; i<this.garage.length; i++){
            if(car==this.garage[i])
                return true;
        }
        return false;
    }

    public void removeCar(Car car) {
        this.garage[0] = null;
    }

    public void addCar(Car car) {
        this.garage[0] = setCar(car, 0);
    }
    public void setGarage(Integer space){
        this.garage = new Car[space];
    }
    public void returnValue(Car car)
    {
        for(int i = 0;i < this.garage.length; i++){
            Device.value += this.garage[0].getValue();
        }
    }
    public void sortGarage(Car car){
        Arrays.sort(garage);
    }
}