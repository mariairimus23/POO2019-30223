package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal {
	public Cow(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
		super(nrOfLegs, name, normalBodyTemp, percBodyHair);
	}

	public Cow() {
		super(4, "COW", 37f, 50f);
	}

}
