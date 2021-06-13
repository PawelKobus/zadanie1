package com.company.devices;


import com.company.creatures.Human;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;


public class Phone extends Device implements salleable {
    final String operationSystem;
    final Double screenSize;
    public Human owner;
    public Human seller;
    private static final String DEFAULT_APP_VERSION = "latest";
    private static final String DEFAULT_APP_SERVER = "appserver.com";
    private static final String DEFAULT_APP_PROTOCOL = "https";

    public Phone(String producer, String model, Integer yearOfProduction, String operationSystem, Double screenSize) {
        super(producer, model, yearOfProduction);
        this.operationSystem = operationSystem;
        this.screenSize = screenSize;
    }

    String getOSVersion(){
        return "4.23.1";
    }

    @Override
    public void turnOn() {
        System.out.println("Włączam telefon");
        System.out.println("Czekam");
        System.out.println("Działczy");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.getAnimal()!=null) {
            if (buyer.cash >= price) {
                buyer.phone = seller.phone;
                seller.phone = null;
                buyer.cash = buyer.cash - price;
                seller.cash = seller.cash + price;
                System.out.println("Telefon sprzedany, zmiana wlasciciela, hajs zabrany");
            }
            else
            {
                System.out.println("Nie stać cie  na Telefon hm");
            }
        }
        else
        {
            System.out.println("Nie masz Telefonu");
        }
    }
    public void installAnApp(String appName) {
        this.installAnApp(appName, DEFAULT_APP_VERSION);
    }

    public void installAnApp(List<String> appNames) {
        for (String appName : appNames) {
            this.installAnApp(appName);
        }
    }

    public void installAnApp(String appName, String version) {
        try {
            URL url = new URL(DEFAULT_APP_PROTOCOL, DEFAULT_APP_SERVER, 443, appName + "_" + version);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    private void installAnApp(URL url) {
        //sprawdzenie czy aplikacja jest płatna
        //obsługa akceptacji płatności
        //sprawdzanie czy mam kasę jeżeli jest płatna
        //sprawdzenie miejsca na dysku
        //obsługa płatności
        //pobieranie
        //walidacja pliku
        //skanowanie wirusów
        //rozpakowanie
        //instalacja
    }

}
