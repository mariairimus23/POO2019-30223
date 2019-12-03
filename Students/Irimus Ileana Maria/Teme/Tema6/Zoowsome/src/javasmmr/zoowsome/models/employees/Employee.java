package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Employee implements XML_Parsable {
	private String name;
	private long id;
	private BigDecimal salary;
	private Boolean isDead = false;

	public Employee(String name, long id, BigDecimal salary, Boolean isDead) {
		this.name = name;
		this.id = (long) Math.floor(Math.random() * 9_000_000_000_000L) + 1_000_000_000_000L;
		// (long) (Math.random() * 10000000 * 1000000);
		this.salary = salary;
		this.isDead = isDead;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getSalary() {
		return this.salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Boolean getIsDead() {
		return this.isDead;
	}

	public void setIsDead(Boolean isDead) {
		this.isDead = isDead;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "id", String.valueOf(this.id));
		createNode(eventWriter, "salary", String.valueOf(this.salary));
		createNode(eventWriter, "isDead", String.valueOf(this.isDead));
	}

	public void decodeFromXml(Element element) {
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setId(Long.valueOf(element.getElementsByTagName("id").item(0).getTextContent()));
		setSalary(new BigDecimal(element.getElementsByTagName("salary").item(0).getTextContent()));
		setIsDead(Boolean.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent()));
	}
}