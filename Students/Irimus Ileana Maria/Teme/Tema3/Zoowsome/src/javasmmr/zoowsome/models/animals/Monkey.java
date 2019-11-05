package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal {

	public Monkey(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
		super(nrOfLegs, name, normalBodyTemp, percBodyHair);
	}

	public Monkey() {
		super(4, "MONKEY", 37f, 70f);
	}
}
