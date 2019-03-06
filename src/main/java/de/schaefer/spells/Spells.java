package de.schaefer.spells;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Spells {
	
	@Id
	@Field
	private String id;
	
	@Field(value = "Name")
	private String name;
	
	@Field(value = "Information")
	private String info;
	
	@Field(value = "School of Magic")
	private String school;
	
	@Field(value = "Level")
	private int level;
	
	@Field(value = "Duration")
	private String duration;
	
	@Field(value = "Castles")
	private List<String> castles;

	public Spells(String name, String info, String school, int level, String duration, List<String> castles) {
		this.name = name;
		this.info = info;
		this.school = school;
		this.level = level;
		this.duration = duration;
		this.castles = castles;
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

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public List<String> getCastles() {
		return castles;
	}

	public void setCastles(List<String> castles) {
		this.castles = castles;
	}

}
