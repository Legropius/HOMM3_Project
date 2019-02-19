package de.schaefer.castles;

public class MageGuild {
	
	private String name;
	private int level;
	public MageGuild(String name, int level) {
		super();
		this.name = name;
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
}
