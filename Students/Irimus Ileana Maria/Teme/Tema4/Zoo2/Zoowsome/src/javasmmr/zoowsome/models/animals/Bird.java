package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animal {

	private Boolean migrates;
	private Integer avgFlightAltitude;

	public Bird(Integer nrOfLegs, String name, Double maintenanceCost, double dangerPerc, Boolean migrates, Integer avgFlightAltitude) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc);
		this.migrates = migrates;
		this.avgFlightAltitude = avgFlightAltitude;
	}

	public Boolean getMigrates() {
		return this.migrates = migrates;
	}

	public void setMigrates(Boolean migrates) {
		this.migrates = migrates;
	}

	public Integer getAvgFlightAltitude() {
		return this.avgFlightAltitude = avgFlightAltitude;
	}

	public void setAvgFlightAltitude(Integer avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}

}
