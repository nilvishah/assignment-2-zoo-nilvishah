package edu.neu.csye6200;

import edu.neu.csye6200.api.AbstractAnimalAPI;

import java.util.ArrayList;
import java.util.List;


//Author - Nilvi Shah - 002838651

public class ZooAbstractAnimals {
    private final List<AbstractAnimalAPI> animals = new ArrayList<>();

    public void addAnimal(AbstractAnimalAPI animal) {
        animals.add(animal);
    }

    public void displayAnimals() {
        animals.forEach(System.out::println);
    }
}
