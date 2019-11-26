package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Owl;
import javasmmr.zoowsome.models.animals.Parrot;
import javasmmr.zoowsome.models.animals.Stork;

public class BirdFactory extends SpeciesFactory {
	@Override
	public Animal getAnimal(String type) throws Exception{
		if (Constants.Animals.Birds.Owl.equals(type)) {
			return new Owl(); // leave empty constructor, for now!
		} else if (Constants.Animals.Birds.Parrot.equals(type)) {
			return new Parrot();
		}  else if (Constants.Animals.Birds.Stork.equals(type)) {
			return new Stork();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
