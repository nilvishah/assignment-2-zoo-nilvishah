package edu.neu.csye6200.derived;

import edu.neu.csye6200.api.AnimalisticAPI;

//Author - Nilvi Shah - 002838651
public class DerivedGiraffeAnimalisiticAPI implements AnimalisticAPI {
    @Override
    public void eats() {
        System.out.println("Giraffe eats acacia");
    }

    @Override
    public String toString() {
        return "I am a Giraffe";
    }
}
