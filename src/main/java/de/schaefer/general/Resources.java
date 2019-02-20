package de.schaefer.general;

public enum Resources {
	
	GOLD ("Gold"), 
	WOOD ("Wood"), 
	ORE ("Ore"), 
	MERCURY ("Mercury"),
	SULFUR ("Sulfur"), 
	CRYSTAL ("Crystal"),
	GEMS ("Gems");

	private final String resource;
	
	Resources(String resource){
		this.resource = resource;
	}

	public String getResource() {
		return resource;
	}
	
}
