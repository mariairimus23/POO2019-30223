package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {
	public Snake(Integer nrOfLegs, String name, Double maintenanceCost, double dangerPerc, Boolean laysEggs) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, laysEggs);
	}

	public Snake() {
		super(0, "SNAKE", 4.8, 0.9, true);
	}

}
