package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal {
	public Cow(Integer nrOfLegs, String name, Double maintenanceCost, double dangerPerc, float normalBodyTemp, float percBodyHair) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, normalBodyTemp, percBodyHair);
	}

	public Cow() {
		super(4, "COW", 3.2, 0.2, 37f, 50f);
	}

}
