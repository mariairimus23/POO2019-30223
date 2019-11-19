package javasmmr.zoowsome.models.animals;

public class Whale extends Aquatic {

	public Whale(Integer nrOfLegs, String name, Double maintenanceCost, double dangerPerc, Integer avgSwimDepth, typeOfWater waterType) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, avgSwimDepth, waterType);
	}

	public Whale() {
		super(0, "WHALE", 5.7, 0.3, 1000, typeOfWater.SALTWATER);
	}
}
