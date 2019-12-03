package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Cow extends Mammal {
	public Cow(Integer nrOfLegs, String name, Double maintenanceCost, double dangerPerc, float normalBodyTemp,
			float percBodyHair) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, normalBodyTemp, percBodyHair);
	}

	public Cow() {
		super(4, "COW", 3.2, 0.2, 37f, 50f);
	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Cow);
	}
}