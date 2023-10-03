package edu.neu.csye6200.derived;

import edu.neu.csye6200.api.AnimalisticAPI;

//Author - Nilvi Shah - 002838651
public class DerivedHorseAnimalisticAPI implements AnimalisticAPI {
    public void eats() {
        System.out.println("Horse eats hay");
    }

    @Override
    public String toString() {
        return "I am a Horse";
    }
}
