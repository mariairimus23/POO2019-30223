package javasmmr.zoowsome.models.animals;

public abstract class Animal implements Killer {
	private Integer nrOfLegs;
	private String name;
	final Double maintenanceCost;
	final double dangerPerc;
	private Boolean takenCareOf = false;

	public Animal(Integer nrOfLegs, String name, Double maintenanceCost, double dangerPerc) {
		this.nrOfLegs = nrOfLegs;
		this.name = name;
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
	}

	public Integer getNrOfLegs() {
		return this.nrOfLegs;
	}

	public void setNrOfLegs(Integer nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getMaintenanceCost() {
		return this.maintenanceCost;
	}

	public Boolean getTakenCareOf() {
		return this.takenCareOf;
	}

	public void setTakenCareOf(Boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}

	public boolean kill() {
		double randomNumber = Math.random();
		if (randomNumber < dangerPerc)
			return true;
		else
			return false;
	}
}