package edu.neu.csye6200.derived;

import edu.neu.csye6200.api.AnimalisticAPI;

//Author - Nilvi Shah - 002838651
public class DerivedDeerAnimalisiticAPI implements AnimalisticAPI {
    @Override
    public void eats() {
        System.out.println("Deer eats crops");
    }

    @Override
    public String toString() {
        return "I am a Deer";
    }
}
