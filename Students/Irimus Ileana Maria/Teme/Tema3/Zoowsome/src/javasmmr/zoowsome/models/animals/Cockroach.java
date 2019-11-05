package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect {
	public Cockroach(Integer nrOfLegs, String name, Boolean canFly, Boolean isDangerous) {
		super(nrOfLegs, name, canFly, isDangerous);
	}

	public Cockroach() {
		super(6, "COCKROACH", true, true);
	}
}
