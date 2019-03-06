package de.schaefer.castles;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import de.schaefer.general.Resources;

@Component
public class CastleDBSeeder implements CommandLineRunner{
	
	private final CastleDao castleDao;
	
	@Autowired
	public CastleDBSeeder(final CastleDao castleDao) {
		this.castleDao = castleDao;
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		MageGuild lvl1 = new MageGuild("Mage guild level 1", 
				Arrays.asList("Village Hall"), 
				"2000 " + Resources.GOLD + ", 5 " + Resources.WOOD.getResource() + " and 5 " + Resources.ORE.getResource() + ".", 
				"A mage guild level 1 will teach five level 1 spells.");
		
		MageGuild lvl2 = new MageGuild("Mage guild level 2", 
				Arrays.asList("Mage guild level 1"), 
				"1000 " + Resources.GOLD + ", 5 " + Resources.WOOD.getResource() + ", 5 " + Resources.ORE.getResource() + ", 4 " + Resources.MERCURY.getResource() + ", 4 " + Resources.SULFUR.getResource() + ", 4 " + Resources.CRYSTAL.getResource() + " and 4 " + Resources.GEMS.getResource() + ".", 
				"A mage guild level 2 will teach four level 2 spells.");
		
		MageGuild lvl3 = new MageGuild("Mage guild level 3", 
				Arrays.asList("Mage guild level 2"), 
				"1000 " + Resources.GOLD + ", 5 " + Resources.WOOD.getResource() + ", 5 " + Resources.ORE.getResource() + ", 6 " + Resources.MERCURY.getResource() + ", 6 " + Resources.SULFUR.getResource() + ", 6 " + Resources.CRYSTAL.getResource() + " and 6 " + Resources.GEMS.getResource() + ".", 
				"A mage guild level 3 will teach three level 3 spells.");
		
		MageGuild lvl4 = new MageGuild("Mage guild level 4", 
				Arrays.asList("Mage guild level 3"), 
				"1000 " + Resources.GOLD + ", 5 " + Resources.WOOD.getResource() + ", 5 " + Resources.ORE.getResource() + ", 8 " + Resources.MERCURY.getResource() + ", 8 " + Resources.SULFUR.getResource() + ", 8 " + Resources.CRYSTAL.getResource() + " and 8 " + Resources.GEMS.getResource() + ".", 
				"A mage guild level 4 will teach two level 4 spells.");
		
		@SuppressWarnings("unused")
		MageGuild lvl5 = new MageGuild("Mage guild level 5", 
				Arrays.asList("Mage guild level 4"), 
				"1000 " + Resources.GOLD + ", 5 " + Resources.WOOD.getResource() + ", 5 " + Resources.ORE.getResource() + ", 10 " + Resources.MERCURY.getResource() + ", 10 " + Resources.SULFUR.getResource() + ", 10 " + Resources.CRYSTAL.getResource() + " and 10 " + Resources.GEMS.getResource() + ".", 
				"A mage guild level 5 will teach one level 5 spells.");
		
		Castle[] castles = {
				new Castle("Castle",
						"Castle is a good alignment town with the knight and cleric hero classes. Castle armies are primarily composed of human men-at-arms, though these towns have also formed an alliance with the griffins and are under the protection of angels. Castle represents Erathia. ",
						Arrays.asList("Knight", "Cleric"),
						Arrays.asList("Guardhouse", "Upg. Guardhouse", "Archers' Tower", "Upg. Archers' Tower", "Griffin Tower", "Upg. Griffin Tower", "Barracks", "Upg. Barracks", "Monastery", "Upg. Monastery", "Training Grounds", "Upg. Training Grounds", "Portal of Glory", "Upg. Portal of Glory"),
						Arrays.asList("Brotherhood of the Sword", "Griffin Bastion", "Lighthouse", "Shipyard", "Stables", "Colossus"),
						"Provides 500 " + Resources.GOLD + " per day.", 
						"Provides 1000 " + Resources.GOLD + " per day.",
						"Provides 2000 " + Resources.GOLD + " per day.", 
						"Provides 4000 " + Resources.GOLD + " per day.", 
						"Adds walls to a town", 
						"Adds moat and primary arrow tower to a town. Increases production of creature dwellings by 50%. ", 
						"Adds two secondary arrow towers, standard walls are strengthened to fortified walls. Increases production of creature dwellings by 100%.", 
						"Tavern is a building where a player may hire heroes, visit Thieves' Guild and hear rumors. It also increases morale of the defending hero's army by +1", 
						"Marketplace is structure where a player can trade resources to other resources, or give resources to other players.",
						"Resource silo is one of the standard buildings. It produces additional 1 " + Resources.WOOD + " and 1 " + Resources.ORE + " per day.", 
						"Blacksmith is one of the standard buildings, which can be built in every town. It enables heroes to buy ballista", 
						Arrays.asList(lvl1, lvl2, lvl3, lvl4))
		};
		
		List<Castle> allCastles = Arrays.asList(castles);
		castleDao.deleteAll();
		castleDao.saveAll(allCastles);
		
	}

}
