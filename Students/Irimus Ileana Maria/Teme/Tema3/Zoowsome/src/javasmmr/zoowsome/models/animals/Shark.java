package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {

	public Shark(Integer nrOfLegs, String name, Integer avgSwimDepth, typeOfWater waterType) {
		super(nrOfLegs, name, avgSwimDepth, waterType);

	}

	public Shark() {
		super(0, "RECHIN", 1000, typeOfWater.SALTWATER);
	}
}
