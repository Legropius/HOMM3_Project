package de.schaefer.general;

public enum Artifact {
	
	TREASURE ("Treasure"),
	MINOR ("Minor"),
	MAJOR ("Major"),
	RELIC ("Relic");

	private final String quality;
	
	Artifact(String quality){
		this.quality = quality;
	}

	public String getQuality() {
		return quality;
	}
}
