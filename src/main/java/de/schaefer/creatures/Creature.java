package de.schaefer.creatures;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Creature {
	
	@Id
	@Field
	private String id;
	
	@Field(value = "Name")
	private String name;
	
	@Field(value = "Town")
	private String town;
	
	@Field(value = "Level")
	private String level;
	
	@Field(value = "Attack")
	private int attack;
	
	@Field(value = "Defense")
	private int defense;
	
	@Field(value = "Minimum Damage")
	private int minDmg;
	
	@Field(value = "Maxiumum Damage")
	private int maxDmg;
	
	@Field(value = "Hitpoints")
	private int hp;
	
	@Field(value = "Speed")
	private int speed;
	
	@Field(value = "Growth")
	private int growth;
	
	@Field(value = "AI Value")
	private int aiVal;
	
	@Field(value = "Cost")
	private String cost;

	public Creature(String name, String town, String level, int attack, int defense, int minDmg, int maxDmg, int hp,
			int speed, int growth, int aiVal, String cost) {
		super();
		this.name = name;
		this.town = town;
		this.level = level;
		this.attack = attack;
		this.defense = defense;
		this.minDmg = minDmg;
		this.maxDmg = maxDmg;
		this.hp = hp;
		this.speed = speed;
		this.growth = growth;
		this.aiVal = aiVal;
		this.cost = cost;
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

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getMinDmg() {
		return minDmg;
	}

	public void setMinDmg(int minDmg) {
		this.minDmg = minDmg;
	}

	public int getMaxDmg() {
		return maxDmg;
	}

	public void setMaxDmg(int maxDmg) {
		this.maxDmg = maxDmg;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getGrowth() {
		return growth;
	}

	public void setGrowth(int growth) {
		this.growth = growth;
	}

	public int getAiVal() {
		return aiVal;
	}

	public void setAiVal(int aiVal) {
		this.aiVal = aiVal;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}
	
}
