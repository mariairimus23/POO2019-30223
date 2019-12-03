package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Cockroach extends Insect {
	public Cockroach(Integer nrOfLegs, String name, Double maintenanceCost, double dangerPerc, Boolean canFly,
			Boolean isDangerous) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, canFly, isDangerous);
	}

	public Cockroach() {
		super(6, "COCKROACH", 0.1, 0.1, true, true);
	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Cockroach);
	}
}