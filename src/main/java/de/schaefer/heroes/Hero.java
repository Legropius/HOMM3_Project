package de.schaefer.heroes;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.mongodb.lang.Nullable;

@Document
public class Hero {
	
	@Id
	@Field
	private String id;
	
	@Field(value = "Name")
	private String name;
	
	@Field(value = "Gender")
	private String gender;
	
	@Field(value = "Race")
	private String race;
	
	@Field(value = "Information")
	private String info;
	
	@Field(value = "Specialty")
	private String specialty;
	
	@Field(value = "Secondary Skills")
	private List<String> secondarySkills;

	@Field(value = "Starting Troops")
	private List<String> startTroops;
	
	@Nullable
	@Field(value = "Starts with")
	private List<String> startsWith;
	
	public Hero(String name, String gender, String race, String info, String specialty, List<String> secondarySkills,
			List<String> startTroops, List<String> startsWith) {
		super();
		this.name = name;
		this.gender = gender;
		this.race = race;
		this.info = info;
		this.specialty = specialty;
		this.secondarySkills = secondarySkills;
		this.startTroops = startTroops;
		this.startsWith = startsWith;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public List<String> getSecondarySkills() {
		return secondarySkills;
	}

	public void setSecondarySkills(List<String> secondarySkills) {
		this.secondarySkills = secondarySkills;
	}

	public List<String> getStartTroops() {
		return startTroops;
	}

	public void setStartTroops(List<String> startTroops) {
		this.startTroops = startTroops;
	}

	public List<String> getStartsWith() {
		return startsWith;
	}

	public void setStartsWith(List<String> startsWith) {
		this.startsWith = startsWith;
	}
	

}
