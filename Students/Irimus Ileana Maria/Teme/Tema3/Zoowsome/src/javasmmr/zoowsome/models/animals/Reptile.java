package javasmmr.zoowsome.models.animals;
public abstract class Reptile extends Animal {
	private Boolean laysEggs;

	public Reptile(Integer nrOfLegs, String name, Boolean laysEggs) {
		super(nrOfLegs, name);
		this.laysEggs = laysEggs;
	}

	public Boolean getLaysEggs() {
		return this.laysEggs = laysEggs;
	}

	public void setLaysEggs(Boolean laysEggs) {
		this.laysEggs = laysEggs;
	}

}
