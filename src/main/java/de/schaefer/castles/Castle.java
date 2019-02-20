package de.schaefer.castles;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Castle {
	
	@Id
	@Field
	private String id;
	
	@Field(value = "Name")
	private String name;
	
	@Field(value = "Information")
	private String info;
	
	@Field(value = "Hero Classes")
	private List<String> heroClasses;
	
	@Field(value = "Creature Dwellings")
	private List<String> creatureDwellings;
	
	@Field(value = "Specific Buildings")
	private List<String> specificBuildings;
	
	@Field(value = "Village Hall")
	private String villageHall;
	
	@Field(value = "Town Hall")
	private String townHall;
	
	@Field(value = "City Hall")
	private String cityHall;
	
	@Field(value = "Capitol")
	private String capitol;
	
	@Field(value = "Fort")
	private String fort;
	
	@Field(value = "Citadel")
	private String citadel;
	
	@Field(value = "Castle")
	private String castle;
	
	@Field(value = "Tavern")
	private String tavern;
	
	@Field(value = "Marketplace")
	private String marketplace;
	
	@Field(value = "Resource Silo")
	private String resourceSilo;
	
	@Field(value = "Blacksmith")
	private String blacksmith;
	
	@Field(value = "Mage Guilds")
	private List<MageGuild> mageGuilds;

	public Castle(String name, String info, List<String> heroClasses, List<String> creatureDwellings,
			List<String> specificBuildings, String villageHall, String townHall, String cityHall, String capitol,
			String fort, String citadel, String castle, String tavern, String marketplace, String resourceSilo,
			String blacksmith, List<MageGuild> mageGuilds) {
		this.name = name;
		this.info = info;
		this.heroClasses = heroClasses;
		this.creatureDwellings = creatureDwellings;
		this.specificBuildings = specificBuildings;
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
		this.mageGuilds = mageGuilds;
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

	public List<String> getHeroClasses() {
		return heroClasses;
	}

	public void setHeroClasses(List<String> heroClasses) {
		this.heroClasses = heroClasses;
	}

	public List<String> getCreatureDwellings() {
		return creatureDwellings;
	}

	public void setCreatureDwellings(List<String> creatureDwellings) {
		this.creatureDwellings = creatureDwellings;
	}

	public List<String> getSpecificBuildings() {
		return specificBuildings;
	}

	public void setSpecificBuildings(List<String> specificBuildings) {
		this.specificBuildings = specificBuildings;
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

	public String getBlacksmith() {
		return blacksmith;
	}

	public void setBlacksmith(String blacksmith) {
		this.blacksmith = blacksmith;
	}

	public List<MageGuild> getMageGuilds() {
		return mageGuilds;
	}

	public void setMageGuilds(List<MageGuild> mageGuilds) {
		this.mageGuilds = mageGuilds;
	}
	
}
