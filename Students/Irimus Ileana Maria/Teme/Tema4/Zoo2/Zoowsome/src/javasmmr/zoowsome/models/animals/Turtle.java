package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile {
	public Turtle(Integer nrOfLegs, String name, Double maintenanceCost, double dangerPerc, Boolean laysEggs) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, laysEggs);
	}

	public Turtle() {
		super(4, "TURTLE", 6.0, 0.3, true);
	}

}
