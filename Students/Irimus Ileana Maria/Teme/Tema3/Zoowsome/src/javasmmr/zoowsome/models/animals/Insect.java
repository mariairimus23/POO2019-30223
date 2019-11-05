package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animal {

	private Boolean canFly;
	private Boolean isDangerous;

	public Insect(Integer nrOfLegs, String name, Boolean canFly, Boolean isDangerous) {
		super(nrOfLegs, name);
		this.canFly = canFly;
		this.isDangerous = isDangerous;
	}

	public Boolean getCanFly() {
		return this.canFly = canFly;
	}

	public void setCanFly(Boolean canFly) {
		this.canFly = canFly;
	}

	public Boolean getIsDangerous() {
		return this.isDangerous = isDangerous;
	}

	public void setIsDangerous(Boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
}
