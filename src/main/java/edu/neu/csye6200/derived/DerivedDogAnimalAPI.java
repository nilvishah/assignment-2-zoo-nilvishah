package edu.neu.csye6200.derived;

import edu.neu.csye6200.api.AnimalAPI;

//Author - Nilvi Shah - 002838651

public class DerivedDogAnimalAPI extends AnimalAPI{
    public void eats()  {
        System.out.println("Dog eats meat");
    }

    @Override
    public String toString() {
        return "I am a Dog";
    }
}
