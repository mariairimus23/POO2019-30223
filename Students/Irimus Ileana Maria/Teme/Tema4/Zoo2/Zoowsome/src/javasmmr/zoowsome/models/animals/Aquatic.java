package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {

	public enum typeOfWater {
		SALTWATER, FRESHWATER;
	}

	private Integer avgSwimDepth;
	private typeOfWater waterType;

	public Aquatic(Integer nrOfLegs, String name, Double maintenanceCost, double dangerPerc, Integer avgSwimDepth, typeOfWater waterType) {
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

}
