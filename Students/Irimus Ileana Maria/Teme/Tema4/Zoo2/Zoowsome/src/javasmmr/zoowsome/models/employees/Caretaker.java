package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employee {

	private Double workingHours;

	public Caretaker(String name, long id, BigDecimal salary, Boolean isDead, double workingHours) {
		super(name, id, salary, isDead);
		this.workingHours = workingHours;
	}

	public Double getWorkingHours() {
		return this.workingHours;
	}

	public void setWorkingHours(Double workingHours) {
		this.workingHours = workingHours;
	}

	public String takeCareOf(Animal animal) {
		if (animal.kill()) {
			return Constants.Employees.Caretaker.TCO_KILLED;
		}
		if (this.workingHours < animal.getMaintenanceCost()) {
			return Constants.Employees.Caretaker.TCO_NO_TIME;
		}
		animal.setTakenCareOf(true);
		this.workingHours = this.workingHours - animal.getMaintenanceCost();
		return Constants.Employees.Caretaker.TCO_SUCCESS;
	}
}