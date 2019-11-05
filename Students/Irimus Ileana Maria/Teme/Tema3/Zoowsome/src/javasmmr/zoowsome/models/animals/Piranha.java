package javasmmr.zoowsome.models.animals;

public class Piranha extends Aquatic {

	public Piranha(Integer nrOfLegs, String name, Integer avgSwimDepth, typeOfWater waterType) {
		super(nrOfLegs, name, avgSwimDepth, waterType);
	}

	public Piranha() {
		super(0, "PIRANHA", 1000, typeOfWater.FRESHWATER);
	}
}
