package de.schaefer.castles;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "castle")
public class Castle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CastleId", columnDefinition = "int(11)")
	private int id;

	@NotNull
	@Column(name = "CastleName", columnDefinition = "Varchar(255)")
	private String name;

	@NotNull
	@Column(name = "VillageHall", columnDefinition = "text")
	private String villageHall;

	@NotNull
	@Column(name = "TownHall", columnDefinition = "text")
	private String townHall;

	@NotNull
	@Column(name = "CityHall", columnDefinition = "text")
	private String cityHall;

	@NotNull
	@Column(name = "Capitol", columnDefinition = "text")
	private String capitol;

	@NotNull
	@Column(name = "Fort", columnDefinition = "text")
	private String fort;

	@NotNull
	@Column(name = "Citadel", columnDefinition = "text")
	private String citadel;

	@NotNull
	@Column(name = "Castle", columnDefinition = "text")
	private String castle;

	@NotNull
	@Column(name = "Tavern", columnDefinition = "text")
	private String tavern;

	@NotNull
	@Column(name = "Marketplace", columnDefinition = "text")
	private String marketplace;

	@NotNull
	@Column(name = "ResourceSilo", columnDefinition = "text")
	private String resourceSilo;

	@NotNull
	@Column(name = "Blacksmith", columnDefinition = "text")
	private String blacksmith;

	@NotNull
	@Column(name = "MageGuild", columnDefinition = "text")
	private String mageGuild;

	@NotNull
	@Column(name = "MageGuildMaxLevel", columnDefinition = "int(11)")
	private int mageGuildMaxLevel;

	@NotNull
	@Column(name = "CreatureGenerator1", columnDefinition = "text")
	private String creatureGenerator1;

	@NotNull
	@Column(name = "CreatureGenerator1plus", columnDefinition = "text")
	private String creatureGenerator1plus;

	@NotNull
	@Column(name = "CreatureGenerator2", columnDefinition = "text")
	private String creatureGenerator2;

	@NotNull
	@Column(name = "CreatureGenerator2plus", columnDefinition = "text")
	private String creatureGenerator2plus;

	@NotNull
	@Column(name = "CreatureGenerator3", columnDefinition = "text")
	private String creatureGenerator3;

	@NotNull
	@Column(name = "CreatureGenerator3plus", columnDefinition = "text")
	private String creatureGenerator3plus;

	@NotNull
	@Column(name = "CreatureGenerator4", columnDefinition = "text")
	private String creatureGenerator4;

	@NotNull
	@Column(name = "CreatureGenerator4plus", columnDefinition = "text")
	private String creatureGenerator4plus;

	@NotNull
	@Column(name = "CreatureGenerator5", columnDefinition = "text")
	private String creatureGenerator5;

	@NotNull
	@Column(name = "CreatureGenerator5plus", columnDefinition = "text")
	private String creatureGenerator5plus;

	@NotNull
	@Column(name = "CreatureGenerator6", columnDefinition = "text")
	private String creatureGenerator6;

	@NotNull
	@Column(name = "CreatureGenerator6plus", columnDefinition = "text")
	private String creatureGenerator6plus;

	@NotNull
	@Column(name = "CreatureGenerator7", columnDefinition = "text")
	private String creatureGenerator7;

	@NotNull
	@Column(name = "CreatureGenerator7plus", columnDefinition = "text")
	private String creatureGenerator7plus;

	@Column(name = "SpecialBuildings", columnDefinition = "text")
	private String specialBuildings;

	public Castle() {
	}

	public Castle(@NotNull String name, @NotNull String villageHall, @NotNull String townHall, @NotNull String cityHall,
			@NotNull String capitol, @NotNull String fort, @NotNull String citadel, @NotNull String castle,
			@NotNull String tavern, @NotNull String marketplace, @NotNull String resourceSilo,
			@NotNull String blacksmith, @NotNull String mageGuild, @NotNull int mageGuildMaxLevel,
			@NotNull String creatureGenerator1, @NotNull String creatureGenerator1plus,
			@NotNull String creatureGenerator2, @NotNull String creatureGenerator2plus,
			@NotNull String creatureGenerator3, @NotNull String creatureGenerator3plus,
			@NotNull String creatureGenerator4, @NotNull String creatureGenerator4plus,
			@NotNull String creatureGenerator5, @NotNull String creatureGenerator5plus,
			@NotNull String creatureGenerator6, @NotNull String creatureGenerator6plus,
			@NotNull String creatureGenerator7, @NotNull String creatureGenerator7plus, String specialBuildings) {
		super();
		this.name = name;
		this.villageHall = villageHall;
		this.townHall = townHall;
		this.cityHall = cityHall;
		this.capitol = capitol;
		this.fort = fort;
		this.citadel = citadel;
		this.castle = castle;
		this.tavern = tavern;
		this.marketplace = marketplace;
		this.resourceSilo = resourceSilo;
		this.blacksmith = blacksmith;
		this.mageGuild = mageGuild;
		this.mageGuildMaxLevel = mageGuildMaxLevel;
		this.creatureGenerator1 = creatureGenerator1;
		this.creatureGenerator1plus = creatureGenerator1plus;
		this.creatureGenerator2 = creatureGenerator2;
		this.creatureGenerator2plus = creatureGenerator2plus;
		this.creatureGenerator3 = creatureGenerator3;
		this.creatureGenerator3plus = creatureGenerator3plus;
		this.creatureGenerator4 = creatureGenerator4;
		this.creatureGenerator4plus = creatureGenerator4plus;
		this.creatureGenerator5 = creatureGenerator5;
		this.creatureGenerator5plus = creatureGenerator5plus;
		this.creatureGenerator6 = creatureGenerator6;
		this.creatureGenerator6plus = creatureGenerator6plus;
		this.creatureGenerator7 = creatureGenerator7;
		this.creatureGenerator7plus = creatureGenerator7plus;
		this.specialBuildings = specialBuildings;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVillageHall() {
		return villageHall;
	}

	public void setVillageHall(String villageHall) {
		this.villageHall = villageHall;
	}

	public String getTownHall() {
		return townHall;
	}

	public void setTownHall(String townHall) {
		this.townHall = townHall;
	}

	public String getCityHall() {
		return cityHall;
	}

	public void setCityHall(String cityHall) {
		this.cityHall = cityHall;
	}

	public String getCapitol() {
		return capitol;
	}

	public void setCapitol(String capitol) {
		this.capitol = capitol;
	}

	public String getFort() {
		return fort;
	}

	public void setFort(String fort) {
		this.fort = fort;
	}

	public String getCitadel() {
		return citadel;
	}

	public void setCitadel(String citadel) {
		this.citadel = citadel;
	}

	public String getCastle() {
		return castle;
	}

	public void setCastle(String castle) {
		this.castle = castle;
	}

	public String getTavern() {
		return tavern;
	}

	public void setTavern(String tavern) {
		this.tavern = tavern;
	}

	public String getMarketplace() {
		return marketplace;
	}

	public void setMarketplace(String marketplace) {
		this.marketplace = marketplace;
	}

	public String getResourceSilo() {
		return resourceSilo;
	}

	public void setResourceSilo(String resourceSilo) {
		this.resourceSilo = resourceSilo;
	}

	public String getTownblacksmith() {
		return blacksmith;
	}

	public void setTownblacksmith(String townblacksmith) {
		this.blacksmith = townblacksmith;
	}

	public String getMageGuild() {
		return mageGuild;
	}

	public void setMageGuild(String mageGuild) {
		this.mageGuild = mageGuild;
	}

	public int getMageGuildMaxLevel() {
		return mageGuildMaxLevel;
	}

	public void setMageGuildMaxLevel(int mageGuildMaxLevel) {
		this.mageGuildMaxLevel = mageGuildMaxLevel;
	}

	public String getCreatureGenerator1() {
		return creatureGenerator1;
	}

	public void setCreatureGenerator1(String creatureGenerator1) {
		this.creatureGenerator1 = creatureGenerator1;
	}

	public String getCreatureGenerator1plus() {
		return creatureGenerator1plus;
	}

	public void setCreatureGenerator1plus(String creatureGenerator1plus) {
		this.creatureGenerator1plus = creatureGenerator1plus;
	}

	public String getCreatureGenerator2() {
		return creatureGenerator2;
	}

	public void setCreatureGenerator2(String creatureGenerator2) {
		this.creatureGenerator2 = creatureGenerator2;
	}

	public String getCreatureGenerator2plus() {
		return creatureGenerator2plus;
	}

	public void setCreatureGenerator2plus(String creatureGenerator2plus) {
		this.creatureGenerator2plus = creatureGenerator2plus;
	}

	public String getCreatureGenerator3() {
		return creatureGenerator3;
	}

	public void setCreatureGenerator3(String creatureGenerator3) {
		this.creatureGenerator3 = creatureGenerator3;
	}

	public String getCreatureGenerator3plus() {
		return creatureGenerator3plus;
	}

	public void setCreatureGenerator3plus(String creatureGenerator3plus) {
		this.creatureGenerator3plus = creatureGenerator3plus;
	}

	public String getCreatureGenerator4() {
		return creatureGenerator4;
	}

	public void setCreatureGenerator4(String creatureGenerator4) {
		this.creatureGenerator4 = creatureGenerator4;
	}

	public String getCreatureGenerator4plus() {
		return creatureGenerator4plus;
	}

	public void setCreatureGenerator4plus(String creatureGenerator4plus) {
		this.creatureGenerator4plus = creatureGenerator4plus;
	}

	public String getCreatureGenerator5() {
		return creatureGenerator5;
	}

	public void setCreatureGenerator5(String creatureGenerator5) {
		this.creatureGenerator5 = creatureGenerator5;
	}

	public String getCreatureGenerator5plus() {
		return creatureGenerator5plus;
	}

	public void setCreatureGenerator5plus(String creatureGenerator5plus) {
		this.creatureGenerator5plus = creatureGenerator5plus;
	}

	public String getCreatureGenerator6() {
		return creatureGenerator6;
	}

	public void setCreatureGenerator6(String creatureGenerator6) {
		this.creatureGenerator6 = creatureGenerator6;
	}

	public String getCreatureGenerator6plus() {
		return creatureGenerator6plus;
	}

	public void setCreatureGenerator6plus(String creatureGenerator6plus) {
		this.creatureGenerator6plus = creatureGenerator6plus;
	}

	public String getCreatureGenerator7() {
		return creatureGenerator7;
	}

	public void setCreatureGenerator7(String creatureGenerator7) {
		this.creatureGenerator7 = creatureGenerator7;
	}

	public String getCreatureGenerator7plus() {
		return creatureGenerator7plus;
	}

	public void setCreatureGenerator7plus(String creatureGenerator7plus) {
		this.creatureGenerator7plus = creatureGenerator7plus;
	}

	public String getSpecialBuildings() {
		return specialBuildings;
	}

	public void setSpecialBuildings(String specialBuildings) {
		this.specialBuildings = specialBuildings;
	}

}
