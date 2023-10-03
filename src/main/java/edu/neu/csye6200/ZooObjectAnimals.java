package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

//Author - Nilvi Shah - 002838651
public class ZooObjectAnimals {
    private final List<Object> animals = new ArrayList<>();

    public void addObject(Object animal) {
        animals.add(animal);
    }

    public void displayAnimals() {
        animals.forEach(System.out::println);
    }
}
/**
 * Zoo_Object_Animals holds and displays a list of animals as generic Objects.
 * It demonstrates that each animal object operates identically using the Object API.
 */