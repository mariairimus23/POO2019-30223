package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Crocodile;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Turtle;

public class ReptileFactory extends SpeciesFactory {
	@Override
	public Animal getAnimal(String type) throws Exception{
		if (Constants.Animals.Reptiles.Crocodile.equals(type)) {
			return new Crocodile(); // leave empty constructor, for now!
		} else if (Constants.Animals.Reptiles.Snake.equals(type)) {
			return new Snake();
		}  else if (Constants.Animals.Reptiles.Turtle.equals(type)) {
			return new Turtle();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}