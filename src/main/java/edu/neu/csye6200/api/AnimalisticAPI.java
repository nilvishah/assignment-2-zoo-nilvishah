package edu.neu.csye6200.api;

//Author - Nilvi Shah - 002838651

public interface AnimalisticAPI {
    void eats(); // This is the abstract method.

    // No need to have @Override annotation for toString method in the interface
    String toString(); // This method is implicitly public and abstract, despite not being declared abstract.
}
