
package edu.neu.csye6200.derived;

import edu.neu.csye6200.api.AbstractAnimalAPI;

//Author - Nilvi Shah - 002838651
public class DerivedCowAbstractAnimalAPI extends AbstractAnimalAPI {
    public void eats() {
        System.out.println("Cow eats grass");
    }

    @Override
    public String toString() {
        return "I am a Cow";
    }
}
