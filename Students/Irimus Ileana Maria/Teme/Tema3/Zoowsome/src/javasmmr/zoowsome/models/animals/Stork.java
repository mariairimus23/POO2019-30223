package javasmmr.zoowsome.models.animals;
public class Stork extends Bird {
	public Stork(Integer nrOfLegs, String name, Boolean migrates, Integer avgFlightAltitude) {
		super(nrOfLegs, name, migrates, avgFlightAltitude);
	}

	public Stork() {
		super(2, "STORK", true, 1000);
	}
}
