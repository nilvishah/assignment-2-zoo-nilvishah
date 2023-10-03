package edu.neu.csye6200.derived;

import edu.neu.csye6200.api.AbstractAnimalAPI;

//Author - Nilvi Shah - 002838651
public class DerivedKangarooAbstractAnimalAPI extends AbstractAnimalAPI {
    public void eats() {
        System.out.println("kangaroo eats moss.");
    }

    @Override
    public String toString() {
        return "I am a Kangaroo";
    }
}
