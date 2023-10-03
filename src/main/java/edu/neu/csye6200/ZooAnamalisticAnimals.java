package edu.neu.csye6200;

import edu.neu.csye6200.api.AnimalisticAPI;

import java.util.ArrayList;
import java.util.List;

//Author - Nilvi Shah - 002838651
public class ZooAnamalisticAnimals {
    private final List<AnimalisticAPI> animals = new ArrayList<>();

    public void addAnimal(AnimalisticAPI animal) {
        animals.add(animal);
    }

    public void displayAnimals() {
        animals.forEach(System.out::println);
    }
}
