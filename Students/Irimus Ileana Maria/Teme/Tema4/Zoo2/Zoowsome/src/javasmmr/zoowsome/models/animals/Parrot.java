package javasmmr.zoowsome.models.animals;

public class Parrot extends Bird {

	public Parrot(Integer nrOfLegs, String name, Double maintenanceCost, double dangerPerc, Boolean migrates, Integer avgFlightAltitude) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, migrates, avgFlightAltitude);
	}

	public Parrot() {
		super(2, "PARROT", 7.9, 0.4, false, 1000);
	}

}
