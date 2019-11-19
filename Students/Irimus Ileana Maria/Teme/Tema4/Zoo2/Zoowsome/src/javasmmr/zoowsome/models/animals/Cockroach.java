package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect {
	public Cockroach(Integer nrOfLegs, String name, Double maintenanceCost, double dangerPerc, Boolean canFly, Boolean isDangerous) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, canFly, isDangerous);
	}

	public Cockroach() {
		super(6, "COCKROACH", 0.1, 0.1, true, true);
	}
}
