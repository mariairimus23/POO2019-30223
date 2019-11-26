package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Parrot extends Bird {

	public Parrot(Integer nrOfLegs, String name, Double maintenanceCost, double dangerPerc, Boolean migrates,
			Integer avgFlightAltitude) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, migrates, avgFlightAltitude);
	}

	public Parrot() {
		super(2, "PARROT", 7.9, 0.4, false, 1000);
	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Parrot);
	}
}