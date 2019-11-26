package javasmmr.zoowsome.controllers;

import java.math.BigDecimal;
import java.util.ArrayList;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class MainController {
	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();

		Animal[] animals = new Animal[7];
		Caretaker[] caretakers = new Caretaker[3];

		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		Animal animal1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Cow);
		Animal animal2 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Monkey);

		SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		Animal animal3 = speciesFactory2.getAnimal(Constants.Animals.Aquatics.Piranha);

		SpeciesFactory speciesFactory3 = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
		Animal animal4 = speciesFactory3.getAnimal(Constants.Animals.Reptiles.Turtle);

		SpeciesFactory speciesFactory4 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		Animal animal5 = speciesFactory4.getAnimal(Constants.Animals.Birds.Parrot);
		Animal animal6 = speciesFactory4.getAnimal(Constants.Animals.Birds.Owl);

		SpeciesFactory speciesFactory5 = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
		Animal animal7 = speciesFactory5.getAnimal(Constants.Animals.Insects.Butterfly);

		animals[0] = animal1;
		animals[1] = animal2;
		animals[2] = animal3;
		animals[3] = animal4;
		animals[4] = animal5;
		animals[5] = animal6;
		animals[6] = animal7;

		Caretaker caretaker1 = new Caretaker("Andrew", 0000000000000, BigDecimal.valueOf(2500.0), false, 10.0);
		Caretaker caretaker2 = new Caretaker("John", 0000000000001, BigDecimal.valueOf(2700.0), false, 8.0);
		Caretaker caretaker3 = new Caretaker("Matthew", 0000000000002, BigDecimal.valueOf(2300.0), false, 12.0);

		caretakers[0] = caretaker1;
		caretakers[1] = caretaker2;
		caretakers[2] = caretaker3;

		String result;
		for (int i = 0; i < caretakers.length; i++) {
			for (int j = 0; j < animals.length; j++) {
				if (caretakers[i].getIsDead() == false && animals[i].getTakenCareOf() == false) {
					result = caretakers[i].takeCareOf(animals[i]);
					if (result.equals(Constants.Employees.Caretaker.TCO_KILLED)) {
						caretakers[i].setIsDead(true);
					} else if (result.equals(Constants.Employees.Caretaker.TCO_SUCCESS)) {
						animals[i].setTakenCareOf(true);
					} else
						j++;
				}
			}
		}

		for (int i = 0; i < animals.length; i++) {
			System.out.println(
					"Animal " + animals[i].getName() + " is taken care of? Answer: " + animals[i].getTakenCareOf());
		}

		System.out.println();

		for (int i = 0; i < caretakers.length; i++) {
			System.out.println(
					"Caretaker " + caretakers[i].getName() + " is alive? Answer: " + caretakers[i].getIsDead());
		}

		AnimalRepository animalRepository = new AnimalRepository();

		ArrayList<Animal> animalsToSave = new ArrayList<Animal>();
		ArrayList<Animal> animalsToLoad = new ArrayList<Animal>();

		animalsToSave.add(animals[0]);
		animalsToSave.add(animals[1]);
		animalsToSave.add(animals[2]);
		animalsToSave.add(animals[3]);
		animalsToSave.add(animals[4]);
		animalsToSave.add(animals[5]);
		animalsToSave.add(animals[6]);

		animalRepository.save(animalsToSave);
		animalsToLoad = animalRepository.load();

		EmployeeRepository employeeRepository = new EmployeeRepository();

		ArrayList<Employee> employeesToSave = new ArrayList<Employee>();
		ArrayList<Employee> employeesToLoad = new ArrayList<Employee>();

		employeesToSave.add(caretakers[0]);
		employeesToSave.add(caretakers[1]);
		employeesToSave.add(caretakers[2]);

		employeeRepository.save(employeesToSave);
		employeesToLoad = employeeRepository.load();
	}
}