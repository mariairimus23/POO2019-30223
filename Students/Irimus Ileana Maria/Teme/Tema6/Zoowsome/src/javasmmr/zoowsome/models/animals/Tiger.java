package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Tiger extends Mammal {

	public Tiger(Integer nrOfLegs, String name, Double maintenanceCost, double dangerPerc, float normalBodyTemp,
			float percBodyHair) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, normalBodyTemp, percBodyHair);
	}

	public Tiger() {
		super(4, "TIGER", 5.1, 0.9, 36f, 85f);
	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Tiger);
	}
}