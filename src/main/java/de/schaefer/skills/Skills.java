package de.schaefer.skills;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.mongodb.lang.Nullable;

@Document
public class Skills {

	@Id
	@Field
	private String id;
	
	@Field(value = "Name")
	private String name;
	
	@Field(value = "Information")
	private String info;
	
	@Nullable
	@Field(value = "Heroes")
	private List<String> heroes;

	public Skills(String name, String info, List<String> heroes) {
		super();
		this.name = name;
		this.info = info;
		this.heroes = heroes;
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

	public List<String> getHeroes() {
		return heroes;
	}

	public void setHeroes(List<String> heroes) {
		this.heroes = heroes;
	}
	
}
