package javasmmr.zoowsome.models.animals;
public class Tiger extends Mammal {

	public Tiger(Integer nrOfLegs, String name, Double maintenanceCost, double dangerPerc, float normalBodyTemp, float percBodyHair) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, normalBodyTemp, percBodyHair);
	}

	public Tiger() {
		super(4, "TIGER", 5.1, 0.9, 36f, 85f);
	}

}
