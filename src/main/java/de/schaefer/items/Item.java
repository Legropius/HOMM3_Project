package de.schaefer.items;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.mongodb.lang.Nullable;

@Document
public class Item {
	
	@Id
	@Field
	private String id;
	
	@Field(value = "Name")
	private String name;
	
	@Field(value = "Slot")
	private String slot;
	
	@Field(value = "Artifact")
	private String artifact;
	
	@Field(value = "Cost")
	private String cost;
	
	@Field(value = "Effect")
	private String effect;
	
	@Nullable
	@Field(value = "Combination")
	private String combination;

	public Item(String name, String slot, String artifact, String cost, String effect, String combination) {
		this.name = name;
		this.slot = slot;
		this.artifact = artifact;
		this.cost = cost;
		this.effect = effect;
		this.combination = combination;
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

	public String getSlot() {
		return slot;
	}

	public void setSlot(String slot) {
		this.slot = slot;
	}

	public String getArtifact() {
		return artifact;
	}

	public void setArtifact(String artifact) {
		this.artifact = artifact;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	public String getCombination() {
		return combination;
	}

	public void setCombination(String combination) {
		this.combination = combination;
	}
	
}
