package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Monkey extends Mammal {

	public Monkey(Integer nrOfLegs, String name, Double maintenanceCost, double dangerPerc, float normalBodyTemp,
			float percBodyHair) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, normalBodyTemp, percBodyHair);
	}

	public Monkey() {
		super(4, "MONKEY", 7.2, 0.5, 37f, 70f);
	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Monkey);
	}
}