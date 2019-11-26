package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Aquatic extends Animal {

	public enum typeOfWater {
		SALTWATER, FRESHWATER;
	}

	private Integer avgSwimDepth;
	private typeOfWater waterType;

	public Aquatic(Integer nrOfLegs, String name, Double maintenanceCost, double dangerPerc, Integer avgSwimDepth,
			typeOfWater waterType) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc);
		this.avgSwimDepth = avgSwimDepth;
		this.waterType = waterType;
	}

	public Integer getAvgSwimDepth() {
		return this.avgSwimDepth = avgSwimDepth;
	}

	public void setAvgSwimDepth(Integer avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}

	public Enum getWaterType() {
		return this.waterType = waterType;
	}

	public void setWaterType(typeOfWater waterType) {
		this.waterType = waterType;
	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "avgSwimDepth", String.valueOf(getAvgSwimDepth()));
		createNode(eventWriter, "waterType", String.valueOf(getWaterType()));
	}

	@Override
	public void decodeFromXml(Element element) {
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("waterType").item(0).getTextContent()));
	}
}