package javasmmr.zoowsome.models.animals;
public class Stork extends Bird {
	public Stork(Integer nrOfLegs, String name, Double maintenanceCost, double dangerPerc, Boolean migrates, Integer avgFlightAltitude) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, migrates, avgFlightAltitude);
	}

	public Stork() {
		super(2, "STORK", 5.4, 0.2, true, 1000);
	}
}
