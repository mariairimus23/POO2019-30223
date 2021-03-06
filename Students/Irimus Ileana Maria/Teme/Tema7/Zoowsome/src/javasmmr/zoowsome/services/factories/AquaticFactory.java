package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Piranha;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.Whale;

public class AquaticFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Aquatics.Piranha.equals(type)) {
			return new Piranha(); // leave empty constructor, for now!
		} else if (Constants.Animals.Aquatics.Shark.equals(type)) {
			return new Shark();
		} else if(Constants.Animals.Aquatics.Whale.equals(type)) {
			return new Whale();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
