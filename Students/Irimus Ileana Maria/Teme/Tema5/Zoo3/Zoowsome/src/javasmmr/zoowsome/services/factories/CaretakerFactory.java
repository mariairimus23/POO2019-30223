package javasmmr.zoowsome.services.factories;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;

public class CaretakerFactory extends EmployeeFactory {

	public Caretaker getEmployee(String type) throws Exception {
		if (Constants.Position.Caretaker.equals(type)) {
			BigDecimal zero = new BigDecimal(0);
			return new Caretaker("dontKnow", 0, zero, false, 0);
		} else {
			throw new Exception("Invalid caretaker exception");
		}
	}
}