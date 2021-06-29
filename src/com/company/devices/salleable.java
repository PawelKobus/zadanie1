package com.company.devices;

import com.company.creatures.Human;

public interface salleable {
    public void sell(Human seller, Human buyer, Double price);

    void sell(Human seller, Human buyer, Double price, Integer parkNumber) throws Exception;
}
