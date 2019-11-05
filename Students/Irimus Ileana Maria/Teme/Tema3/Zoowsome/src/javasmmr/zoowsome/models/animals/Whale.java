package javasmmr.zoowsome.models.animals;

public class Whale extends Aquatic {

	public Whale(Integer nrOfLegs, String name, Integer avgSwimDepth, typeOfWater waterType) {
		super(nrOfLegs, name, avgSwimDepth, waterType);
	}

	public Whale() {
		super(0, "WHALE", 1000, typeOfWater.SALTWATER);
	}
}
