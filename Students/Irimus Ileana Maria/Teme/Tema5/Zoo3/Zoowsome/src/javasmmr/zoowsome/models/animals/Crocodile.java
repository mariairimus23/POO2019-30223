package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Crocodile extends Reptile {

	public Crocodile(Integer nrOfLegs, String name, Double maintenanceCost, double dangerPerc, Boolean laysEggs) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, laysEggs);
	}

	public Crocodile() {
		super(4, "CROCODILE", 7.0, 0.9, true);
	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Crocodile);
	}
}