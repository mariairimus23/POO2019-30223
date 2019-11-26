package javasmmr.zoowsome.repositories;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Crocodile;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Owl;
import javasmmr.zoowsome.models.animals.Parrot;
import javasmmr.zoowsome.models.animals.Piranha;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Spider;
import javasmmr.zoowsome.models.animals.Stork;
import javasmmr.zoowsome.models.animals.Tiger;
import javasmmr.zoowsome.models.animals.Turtle;
import javasmmr.zoowsome.models.animals.Whale;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventFactory;

public class AnimalRepository {

	private static final String XML_FILENAME = "Animals.xml";

	public AnimalRepository() throws ParserConfigurationException {

	}

	public void save(ArrayList<Animal> animals) throws FileNotFoundException, XMLStreamException {
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
		XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		StartDocument startDocument = eventFactory.createStartDocument();
		eventWriter.add(startDocument);
		StartElement configStartElement = eventFactory.createStartElement("", "", "content");
		eventWriter.add(configStartElement);
		eventWriter.add(end);
		for (Animal animal : animals) {
			StartElement sElement = eventFactory.createStartElement("", "", Constants.XML_TAGS.ANIMAL);
			eventWriter.add(sElement);
			eventWriter.add(end);

			animal.encodeToXml(eventWriter);
			EndElement eElement = eventFactory.createEndElement("", "", Constants.XML_TAGS.ANIMAL);
			eventWriter.add(eElement);
			eventWriter.add(end);
		}
		eventWriter.add(eventFactory.createEndElement("", "", Constants.XML_TAGS.ANIMAL));
		eventWriter.add(eventFactory.createEndDocument());
		eventWriter.close();
	}

	public ArrayList<Animal> load() throws ParserConfigurationException, SAXException, IOException {

		ArrayList<Animal> animals = new ArrayList<Animal>();

		File fXmlFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();

		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);

		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(1);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0)
						.getTextContent();

				switch (discriminant) {
				case Constants.Animals.Insects.Butterfly:
					Animal butterfly = new Butterfly();
					butterfly.decodeFromXml(element);
					animals.add(butterfly);
					break;

				case Constants.Animals.Insects.Cockroach:
					Animal cockroach = new Cockroach();
					cockroach.decodeFromXml(element);
					animals.add(cockroach);
					break;

				case Constants.Animals.Insects.Spider:
					Animal spider = new Spider();
					spider.decodeFromXml(element);
					animals.add(spider);
					break;

				case Constants.Animals.Aquatics.Piranha:
					Animal piranha = new Piranha();
					piranha.decodeFromXml(element);
					animals.add(piranha);
					break;

				case Constants.Animals.Aquatics.Shark:
					Animal shark = new Shark();
					shark.decodeFromXml(element);
					animals.add(shark);
					break;

				case Constants.Animals.Aquatics.Whale:
					Animal whale = new Whale();
					whale.decodeFromXml(element);
					animals.add(whale);
					break;

				case Constants.Animals.Birds.Owl:
					Animal owl = new Owl();
					owl.decodeFromXml(element);
					animals.add(owl);
					break;

				case Constants.Animals.Birds.Parrot:
					Animal parrot = new Parrot();
					parrot.decodeFromXml(element);
					animals.add(parrot);
					break;

				case Constants.Animals.Birds.Stork:
					Animal stork = new Stork();
					stork.decodeFromXml(element);
					animals.add(stork);
					break;

				case Constants.Animals.Mammals.Cow:
					Animal cow = new Cow();
					cow.decodeFromXml(element);
					animals.add(cow);
					break;

				case Constants.Animals.Mammals.Monkey:
					Animal monkey = new Monkey();
					monkey.decodeFromXml(element);
					animals.add(monkey);
					break;

				case Constants.Animals.Mammals.Tiger:
					Animal tiger = new Tiger();
					tiger.decodeFromXml(element);
					animals.add(tiger);
					break;

				case Constants.Animals.Reptiles.Crocodile:
					Animal crocodile = new Crocodile();
					crocodile.decodeFromXml(element);
					animals.add(crocodile);
					break;

				case Constants.Animals.Reptiles.Snake:
					Animal snake = new Snake();
					snake.decodeFromXml(element);
					animals.add(snake);
					break;

				case Constants.Animals.Reptiles.Turtle:
					Animal turtle = new Turtle();
					turtle.decodeFromXml(element);
					animals.add(turtle);
					break;

				default:
					break;
				}
			}
		}
		return animals;
	}

	public static void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException {
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		XMLEvent tab = eventFactory.createDTD("\t");

		StartElement sElement = eventFactory.createStartElement("", "", name);
		eventWriter.add(tab);
		eventWriter.add(sElement);

		Characters characters = eventFactory.createCharacters(value);
		eventWriter.add(characters);

		EndElement eElement = eventFactory.createEndElement("", "", name);
		eventWriter.add(eElement);
		eventWriter.add(end);
	}
}