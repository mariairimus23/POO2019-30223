package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal {

	public Monkey(Integer nrOfLegs, String name, Double maintenanceCost, double dangerPerc, float normalBodyTemp, float percBodyHair) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, normalBodyTemp, percBodyHair);
	}

	public Monkey() {
		super(4, "MONKEY", 7.2, 0.5, 37f, 70f);
	}
}
