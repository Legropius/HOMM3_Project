package de.schaefer.castles.dwellings;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Dwellings {
	
	@Id
	@Field
	private String id;
	
	@Field(value = "Level")
	private String level;
	
	@Field(value = "Name")
	private String name;
	
	@Field(value = "Costs")
	private String cost;
	
	@Field(value = "Requirements")
	private List<String> requirements;
	
	@Field(value = "Produces")
	private String produces;

	public Dwellings(String name, String level, String cost, List<String> requirements, String produces) {
		super();
		this.name = name;
		this.level = level;
		this.cost = cost;
		this.requirements = requirements;
		this.produces = produces;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public List<String> getRequirements() {
		return requirements;
	}

	public void setRequirements(List<String> requirements) {
		this.requirements = requirements;
	}

	public String getProduces() {
		return produces;
	}

	public void setProduces(String produces) {
		this.produces = produces;
	}
	
}
