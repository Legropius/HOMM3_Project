package de.schaefer.castles.dwellings;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import de.schaefer.creatures.Creature;

@Document
public class Dwellings {
	
	@Id
	@Field
	private String id;
	
	@Field(value = "Name")
	private String name;
	
	@Field(value = "Costs")
	private String cost;
	
	@Field(value = "Requirements")
	private List<String> requirements;
	
	@Field(value = "Produces")
	private Creature produces;

	public Dwellings(String name, String cost, List<String> requirements, Creature produces) {
		super();
		this.name = name;
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

	public Creature getProduces() {
		return produces;
	}

	public void setProduces(Creature produces) {
		this.produces = produces;
	}
	
}
