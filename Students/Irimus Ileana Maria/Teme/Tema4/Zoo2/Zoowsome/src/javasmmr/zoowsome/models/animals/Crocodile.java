package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile {

	public Crocodile(Integer nrOfLegs, String name, Double maintenanceCost, double dangerPerc, Boolean laysEggs) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, laysEggs);
	}

	public Crocodile() {
		super(4, "CROCODILE", 7.0, 0.9,true);
	}

}
