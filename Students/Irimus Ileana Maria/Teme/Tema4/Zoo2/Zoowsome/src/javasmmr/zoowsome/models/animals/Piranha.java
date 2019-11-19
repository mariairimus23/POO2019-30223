package javasmmr.zoowsome.models.animals;

public class Piranha extends Aquatic {

	public Piranha(Integer nrOfLegs, String name, Double maintenanceCost, double dangerPerc, Integer avgSwimDepth, typeOfWater waterType) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, avgSwimDepth, waterType);
	}

	public Piranha() {
		super(0, "PIRANHA", 0.4, 0.7, 1000, typeOfWater.FRESHWATER);
	}
}
