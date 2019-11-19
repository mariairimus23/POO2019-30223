package javasmmr.zoowsome.models.animals;
public class Spider extends Insect {
	public Spider(Integer nrOfLegs, String name, Double maintenanceCost, double dangerPerc, Boolean canFly, Boolean isDangerous) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, canFly, isDangerous);
	}

	public Spider() {
		super(8, "SPIDER", 0.7, 0.6, false, true);
	}
}
