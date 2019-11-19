package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {
	public Butterfly(Integer nrOfLegs, String name, Double maintenanceCost, double dangerPerc, Boolean canFly, Boolean isDangerous) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, canFly, isDangerous);
	}

	public Butterfly() {
		super(6, "BUTTERFLY", 1.0, 0.0, true, false);
	}
}
