package edu.neu.csye6200;

import edu.neu.csye6200.api.AnimalAPI;

import java.util.ArrayList;
import java.util.List;

//Author - Nilvi Shah - 002838651
public class ZooAnimals {
    private final List<AnimalAPI> animals = new ArrayList<>();

    public void addAnimal(AnimalAPI animal) {
        animals.add(animal);
    }

    public void displayAnimals() {
        animals.forEach(System.out::println);
    }
}
