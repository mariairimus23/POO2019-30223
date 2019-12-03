package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Stork extends Bird {
	public Stork(Integer nrOfLegs, String name, Double maintenanceCost, double dangerPerc, Boolean migrates,
			Integer avgFlightAltitude) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, migrates, avgFlightAltitude);
	}

	public Stork() {
		super(2, "STORK", 5.4, 0.2, true, 1000);
	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Stork);
	}
}