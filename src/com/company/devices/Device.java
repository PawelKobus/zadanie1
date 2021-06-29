package com.company.devices;

abstract public class Device
{

    public final String producer;
    public final String model;
    public final Integer productionYear;
    public static Double value = 0.0;

    public Device(String producer, String model, Integer productionYear) {
        this.producer = producer;
        this.model = model;
        this.productionYear = productionYear;
    }
    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
    public void turnOn(){
        System.out.println("odpalony");
    }

}
