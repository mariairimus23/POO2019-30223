package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

public abstract class Employee {
	private String name;
	private long id;
	private BigDecimal salary;
	private Boolean isDead = false;

	public Employee(String name, long id, BigDecimal salary, Boolean isDead) {
		this.name = name;
		this.id = (long) Math.floor(Math.random() * 9_000_000_000_000L) + 1_000_000_000_000L;
		 //(long) (Math.random() * 10000000 * 1000000);
		this.salary = salary;
		this.isDead = isDead;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getSalary() {
		return this.salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Boolean getIsDead() {
		return this.isDead;
	}

	public void setIsDead(Boolean isDead) {
		this.isDead = isDead;
	}
}