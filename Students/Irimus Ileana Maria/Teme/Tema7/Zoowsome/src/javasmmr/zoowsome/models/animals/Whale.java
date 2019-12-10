package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Whale extends Aquatic {

	public Whale(Integer nrOfLegs, String name, Double maintenanceCost, double dangerPerc, Integer avgSwimDepth,
			typeOfWater waterType) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, avgSwimDepth, waterType);
	}

	public Whale() {
		super(0, "WHALE", 5.7, 0.3, 1000, typeOfWater.SALTWATER);
	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Whale);
	}
}