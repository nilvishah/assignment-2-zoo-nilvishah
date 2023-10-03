package edu.neu.csye6200; // root package

import edu.neu.csye6200.derived.*; // importing al the derived classes


// Author - Nilvi Shah - 002838651
public class Driver {
	public static void main(String[] args) {
		ZooAnimals zooAnimals = new ZooAnimals();
		zooAnimals.addAnimal(new DerivedRabbitAnimalAPI());
		zooAnimals.addAnimal(new DerivedPandaAnimalAPI());
		zooAnimals.addAnimal(new DerivedDogAnimalAPI());
		System.out.println("\nZoo_Animals:");
		zooAnimals.displayAnimals();

		ZooAbstractAnimals zooAbstractAnimals = new ZooAbstractAnimals();
		zooAbstractAnimals.addAnimal(new DerivedKangarooAbstractAnimalAPI());
		zooAbstractAnimals.addAnimal(new DerivedCatAbstractAnimalAPI());
		zooAbstractAnimals.addAnimal(new DerivedCowAbstractAnimalAPI());
		System.out.println("\nZoo_Abstract_Animals:");
		zooAbstractAnimals.displayAnimals();

		ZooAnamalisticAnimals zooAnamalisticAnimals = new ZooAnamalisticAnimals();
		zooAnamalisticAnimals.addAnimal(new DerivedGiraffeAnimalisiticAPI());
		zooAnamalisticAnimals.addAnimal(new DerivedDeerAnimalisiticAPI());
		zooAnamalisticAnimals.addAnimal(new DerivedHorseAnimalisticAPI());
		System.out.println("\nZoo_Anamalistic_Animals:");
		zooAnamalisticAnimals.displayAnimals();

		ZooObjectAnimals zooObjectAnimals = new ZooObjectAnimals();
		zooObjectAnimals.addObject(new DerivedDogAnimalAPI());
		zooObjectAnimals.addObject(new DerivedHorseAnimalisticAPI());
		zooObjectAnimals.addObject(new DerivedCowAbstractAnimalAPI());
		zooObjectAnimals.addObject(new DerivedRabbitAnimalAPI());
		zooObjectAnimals.addObject(new DerivedGiraffeAnimalisiticAPI());
		zooObjectAnimals.addObject(new DerivedKangarooAbstractAnimalAPI());
		zooObjectAnimals.addObject(new DerivedPandaAnimalAPI());
		zooObjectAnimals.addObject(new DerivedDeerAnimalisiticAPI());
		zooObjectAnimals.addObject(new DerivedCatAbstractAnimalAPI());
		System.out.println("\nZoo_Object_Animals:");
		zooObjectAnimals.displayAnimals();
	}
}
