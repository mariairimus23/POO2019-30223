package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Piranha extends Aquatic {

	public Piranha(Integer nrOfLegs, String name, Double maintenanceCost, double dangerPerc, Integer avgSwimDepth,
			typeOfWater waterType) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, avgSwimDepth, waterType);
	}

	public Piranha() {
		super(0, "PIRANHA", 0.4, 0.7, 1000, typeOfWater.FRESHWATER);
	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Piranha);
	}
}