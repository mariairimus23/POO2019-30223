package javasmmr.zoowsome.models.animals;

public class Owl extends Bird {

	public Owl(Integer nrOfLegs, String name, Double maintenanceCost, double dangerPerc, Boolean migrates, Integer avgFlightAltitude) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, migrates, avgFlightAltitude);
	}

	public Owl() {
		super(2, "OWL", 3.6, 0.2, false, 100);
	}
}
