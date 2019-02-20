package de.schaefer.castles;

import java.util.List;

public class MageGuild {
	
	private String name;
	private List<String> requirements;
	private String cost;
	private String info;
	
	public MageGuild(String name, List<String> requirements, String cost, String info) {
		super();
		this.name = name;
		this.requirements = requirements;
		this.cost = cost;
		this.info = info;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getRequirements() {
		return requirements;
	}

	public void setRequirements(List<String> requirements) {
		this.requirements = requirements;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
}
