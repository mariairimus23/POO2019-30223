package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.models.employees.Investor;
import javasmmr.zoowsome.models.employees.Manager;

public class EmployeeFactory extends EmployeeAbstractFactory {
	public EmployeeFactory getEmployeeFactory(String type) throws Exception {
		if (Constants.Position.Caretaker.equals(type)) {
			return new CaretakerFactory();
		} else
			throw new Exception("Invalid position exception");
	}
}