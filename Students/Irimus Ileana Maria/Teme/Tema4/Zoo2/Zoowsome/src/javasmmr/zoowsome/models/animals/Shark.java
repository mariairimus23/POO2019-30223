package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {

	public Shark(Integer nrOfLegs, String name, Double maintenanceCost, double dangerPerc, Integer avgSwimDepth, typeOfWater waterType) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, avgSwimDepth, waterType);

	}

	public Shark() {
		super(0, "SHARK", 3.6, 0.9, 1000, typeOfWater.SALTWATER);
	}
}
