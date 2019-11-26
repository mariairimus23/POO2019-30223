package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Butterfly extends Insect {
	public Butterfly(Integer nrOfLegs, String name, Double maintenanceCost, double dangerPerc, Boolean canFly,
			Boolean isDangerous) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, canFly, isDangerous);
	}

	public Butterfly() {
		super(6, "BUTTERFLY", 1.0, 0.0, true, false);
	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Butterfly);
	}
}