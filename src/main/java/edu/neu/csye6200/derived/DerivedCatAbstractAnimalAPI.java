package edu.neu.csye6200.derived;

import edu.neu.csye6200.api.AbstractAnimalAPI;

//Author - Nilvi Shah - 002838651
public class DerivedCatAbstractAnimalAPI extends AbstractAnimalAPI {
    public void eats() {
        System.out.println("Cat drinks milk");
    }

    @Override
    public String toString() {
        return "I am a Cat";
    }
}
