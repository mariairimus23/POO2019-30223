package javasmmr.zoowsome.models.animals;
public abstract class Reptile extends Animal {
	private Boolean laysEggs;

	public Reptile(Integer nrOfLegs, String name, double dangerPerc, Double maintenanceCost, Boolean laysEggs) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc);
		this.laysEggs = laysEggs;
	}

	public Boolean getLaysEggs() {
		return this.laysEggs = laysEggs;
	}

	public void setLaysEggs(Boolean laysEggs) {
		this.laysEggs = laysEggs;
	}

}
