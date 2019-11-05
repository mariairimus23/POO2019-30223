package javasmmr.zoowsome.models.animals;
public class Spider extends Insect {
	public Spider(Integer nrOfLegs, String name, Boolean canFly, Boolean isDangerous) {
		super(nrOfLegs, name, canFly, isDangerous);
	}

	public Spider() {
		super(8, "SPIDER", false, true);
	}
}
