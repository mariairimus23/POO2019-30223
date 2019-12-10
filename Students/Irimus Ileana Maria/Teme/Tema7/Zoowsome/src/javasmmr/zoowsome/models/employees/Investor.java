package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

public class Investor extends Employee {

	public Investor(String name, long id, BigDecimal salary, Boolean isDead) {
		super(name, id, salary, isDead);
	}
}