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
						"Resource silo is one of the standard buildings. It produces additional 1 " + Resources.WOOD.getResource() + " and 1 " + Resources.ORE.getResource() + " per day.", 
						"Blacksmith is one of the standard buildings, which can be built in every town. It enables heroes to buy a ballista", 
						Arrays.asList(lvl1, lvl2, lvl3, lvl4)),
				
				new Castle("Rampart",
						"Rampart is a good alignment town with the ranger and druid hero classes. Ramparts are built by creatures in allied defense of the unspoiled wilderness regions of Enroth. Rampart represents AvLee.",
						Arrays.asList("Ranger", "Druid"),
						Arrays.asList("Centaur Stables", "Upg. Centaur Stables", "Dwarf Cottage", "Upg. Dwarf Cottage", "Homestead", "Upg. Homestead", "Enchanted Spring", "Upg. Enchanted Spring", "Dendroid Arches", "Upg. Dendroid Arches", "Unicorn Glade", "Upg. Unicorn Glade", "Dragon Cliffs", "Upg. Dragon Cliffs"),
						Arrays.asList("Dendroid Saplings", "Treasury", "Fountain of Fortune", "Miners' Guild", "Mystic Pond", "Spirit Guardian"),
						"Provides 500 " + Resources.GOLD + " per day.", 
						"Provides 1000 " + Resources.GOLD + " per day.",
						"Provides 2000 " + Resources.GOLD + " per day.", 
						"Provides 4000 " + Resources.GOLD + " per day.", 
						"Adds walls to a town", 
						"Adds moat and primary arrow tower to a town. Increases production of creature dwellings by 50%. ", 
						"Adds two secondary arrow towers, standard walls are strengthened to fortified walls. Increases production of creature dwellings by 100%.", 
						"Tavern is a building where a player may hire heroes, visit Thieves' Guild and hear rumors. It also increases morale of the defending hero's army by +1", 
						"Marketplace is structure where a player can trade resources to other resources, or give resources to other players.",
						"Resource silo is one of the standard buildings. It produces additional 1 " + Resources.CRYSTAL.getResource() + " per day.", 
						"Blacksmith is one of the standard buildings, which can be built in every town. It enables heroes to buy a first aid tent", 
						Arrays.asList(lvl1, lvl2, lvl3, lvl4, lvl5)),
				
				new Castle("Tower",
						"Tower is a good alignment town with alchemist and wizard hero classes. Tower populations are comprised of creatures bound into service by powerful magic, made on the spot, or allied with the town through ancient pacts. Tower represents Bracada.",
						Arrays.asList("Alchemist", "Wizard"),
						Arrays.asList("Workshop", "Upg. Workshop", "Parapet", "Upg. Parapet", "Golem Factory", "Upg. Golem Factory", "Mage Tower", "Upg. Mage Tower", "Altar of Wishes", "Upg. Altar of Wishes", "Golden Pavilion", "Upg. Golden Pavilion", "Cloud Temple", "Upg. Cloud Temple"),
						Arrays.asList("Artifact Merchants", "Library", "Lookout Tower", "Sculptor's Wings", "Wall of Knowledge", "Skyship"),
						"Provides 500 " + Resources.GOLD + " per day.", 
						"Provides 1000 " + Resources.GOLD + " per day.",
						"Provides 2000 " + Resources.GOLD + " per day.", 
						"Provides 4000 " + Resources.GOLD + " per day.", 
						"Adds walls to a town", 
						"Adds moat and primary arrow tower to a town. Increases production of creature dwellings by 50%. ", 
						"Adds two secondary arrow towers, standard walls are strengthened to fortified walls. Increases production of creature dwellings by 100%.", 
						"Tavern is a building where a player may hire heroes, visit Thieves' Guild and hear rumors. It also increases morale of the defending hero's army by +1", 
						"Marketplace is structure where a player can trade resources to other resources, or give resources to other players.",
						"Resource silo is one of the standard buildings. It produces additional 1 " + Resources.GEMS.getResource() + " per day.", 
						"Blacksmith is one of the standard buildings, which can be built in every town. It enables heroes to buy an ammo cart", 
						Arrays.asList(lvl1, lvl2, lvl3, lvl4, lvl5)),
				
				new Castle("Inferno",
						"Inferno is an evil alignment town with the demoniac and heretic hero classes. Infernos can be found in Erathian regions blighted by the emergence of the underworld on the surface. Demoniac and heretic heroes stand in an uneasy alliance with these towns. Inferno represents Eeofol.",
						Arrays.asList("Demoniac", "Heretic"),
						Arrays.asList("Imp Crucible", "Upg. Imp Crucible", "Hall of Sins", "Upg. Hall of Sins", "Kennels", "Upg. Kennels", "Demon Gate", "Upg. Demon Gate", "Hell Hole", "Upg. Hell Hole", "Fire Lake", "Upg. Fire Lake", "Forsaken Palace", "Upg. Forsaken Palace"),
						Arrays.asList("Birthing Pool", "Brimstone Stormclouds", "Cages", "Castle Gate", "Order of Fire", "Deity of Fire"),
						"Provides 500 " + Resources.GOLD + " per day.", 
						"Provides 1000 " + Resources.GOLD + " per day.",
						"Provides 2000 " + Resources.GOLD + " per day.", 
						"Provides 4000 " + Resources.GOLD + " per day.", 
						"Adds walls to a town", 
						"Adds moat and primary arrow tower to a town. Increases production of creature dwellings by 50%. ", 
						"Adds two secondary arrow towers, standard walls are strengthened to fortified walls. Increases production of creature dwellings by 100%.", 
						"Tavern is a building where a player may hire heroes, visit Thieves' Guild and hear rumors. It also increases morale of the defending hero's army by +1", 
						"Marketplace is structure where a player can trade resources to other resources, or give resources to other players.",
						"Resource silo is one of the standard buildings. It produces additional 1 " + Resources.SULFUR.getResource() + " per day.", 
						"Blacksmith is one of the standard buildings, which can be built in every town. It enables heroes to buy an ammo cart", 
						Arrays.asList(lvl1, lvl2, lvl3, lvl4, lvl5)),
				
				new Castle("Necropolis",
						"Necropolis is an evil alignment town, that is overrun and ruled by undead creatures. They are the natural bases for the necromancer and death knight hero classes. Necropolis represents Deyja.",
						Arrays.asList("Death Knight", "Necromancer"),
						Arrays.asList("Cursed Temple", "Upg. Cursed Temple", "Graveyard", "Upg. Graveyard", "Tomb of Souls", "Upg. Tomb of Souls", "Estate", "Upg. Estate", "Mausoleum", "Upg. Mausoleum", "Hall of Darkness", "Upg. Hall of Darkness", "Dragon Vault", "Upg. Dragon Vault"),
						Arrays.asList("Cover of Darkness", "Necromancy Amplifier", "Skeleton Transformer", "Shipyard", "Soul Prison", "Unearthed Graves"),
						"Provides 500 " + Resources.GOLD + " per day.", 
						"Provides 1000 " + Resources.GOLD + " per day.",
						"Provides 2000 " + Resources.GOLD + " per day.", 
						"Provides 4000 " + Resources.GOLD + " per day.", 
						"Adds walls to a town", 
						"Adds moat and primary arrow tower to a town. Increases production of creature dwellings by 50%. ", 
						"Adds two secondary arrow towers, standard walls are strengthened to fortified walls. Increases production of creature dwellings by 100%.", 
						"Tavern is a building where a player may hire heroes, visit Thieves' Guild and hear rumors. It also increases morale of the defending hero's army by +1", 
						"Marketplace is structure where a player can trade resources to other resources, or give resources to other players.",
						"Resource silo is one of the standard buildings. It produces additional 1 " + Resources.WOOD.getResource() + " and 1 " + Resources.ORE.getResource() + " per day.", 
						"Blacksmith is one of the standard buildings, which can be built in every town. It enables heroes to buy a first aid tent", 
						Arrays.asList(lvl1, lvl2, lvl3, lvl4, lvl5)),
				
				new Castle("Dungeon",
						"Dungeon is an evil alignment town. Dungeons are built by the warlock and overlord hero classes to act as bases from which to wage campaigns of conquest for wealth and power. Similarly minded creatures are attracted as allies. Other dungeon creatures are in thrall to their masters. Dungeon represents Nighon.",
						Arrays.asList("Overlord", "Warlock"),
						Arrays.asList("Warren", "Upg. Warren", "Harpy Loft", "Upg. Harpy Loft", "Pillar of Eyes", "Upg. Pillar of Eyes", "Chapel of Stilled Voices", "Upg. Chapel of Stilled Voices", "Labyrinth", "Upg. Labyrinth", "Manticore Lair", "Upg. Manticore Lair", "Dragon Cave", "Upg. Dragon Cave"),
						Arrays.asList("Artifact Merchants", "Portal of Summoning", "Mana Vortex", "Battle Scholar Academy", "Guardian of Earth", "Mushroom Rings"),
						"Provides 500 " + Resources.GOLD + " per day.", 
						"Provides 1000 " + Resources.GOLD + " per day.",
						"Provides 2000 " + Resources.GOLD + " per day.", 
						"Provides 4000 " + Resources.GOLD + " per day.", 
						"Adds walls to a town", 
						"Adds moat and primary arrow tower to a town. Increases production of creature dwellings by 50%. ", 
						"Adds two secondary arrow towers, standard walls are strengthened to fortified walls. Increases production of creature dwellings by 100%.", 
						"Tavern is a building where a player may hire heroes, visit Thieves' Guild and hear rumors. It also increases morale of the defending hero's army by +1", 
						"Marketplace is structure where a player can trade resources to other resources, or give resources to other players.",
						"Resource silo is one of the standard buildings. It produces additional 1 " + Resources.SULFUR.getResource() + " per day.", 
						"Blacksmith is one of the standard buildings, which can be built in every town. It enables heroes to buy a ballista", 
						Arrays.asList(lvl1, lvl2, lvl3, lvl4, lvl5)),
				
				new Castle("Stronghold",
						"Stronghold is a neutral alignment town with the barbarian and battle mage hero classes. Strongholds are built by alliances of tribes. Stronghold represents Krewlod.",
						Arrays.asList("Overlord", "Warlock"),
						Arrays.asList("Goblin Barracks", "Upg. Goblin Barracks", "Wolf Pen", "Upg. Wolf Pen", "Orc Tower", "Upg. Orc Tower", "Ogre Fort", "Upg. Ogre Fort", "Cliff Nest", "Upg. Cliff Nest", "Cyclops Cave", "Upg. Cyclops Cave", "Behemoth Lair", "Upg. Behemoth Lair"),
						Arrays.asList("Ballista Yard", "Freelancer's Guild", "Mess Hall", "Escape Tunnel", "Hall of Valhalla", "Warlords' Monument"),
						"Provides 500 " + Resources.GOLD + " per day.", 
						"Provides 1000 " + Resources.GOLD + " per day.",
						"Provides 2000 " + Resources.GOLD + " per day.", 
						"Provides 4000 " + Resources.GOLD + " per day.", 
						"Adds walls to a town", 
						"Adds moat and primary arrow tower to a town. Increases production of creature dwellings by 50%. ", 
						"Adds two secondary arrow towers, standard walls are strengthened to fortified walls. Increases production of creature dwellings by 100%.", 
						"Tavern is a building where a player may hire heroes, visit Thieves' Guild and hear rumors. It also increases morale of the defending hero's army by +1", 
						"Marketplace is structure where a player can trade resources to other resources, or give resources to other players.",
						"Resource silo is one of the standard buildings. It produces additional 1 " + Resources.WOOD.getResource() + " and 1 " + Resources.ORE.getResource() + " per day.",
						"Blacksmith is one of the standard buildings, which can be built in every town. It enables heroes to buy an ammo cart", 
						Arrays.asList(lvl1, lvl2, lvl3, lvl4, lvl5)),
				
				new Castle("Fortress",
						"Fortress is a neutral alignment town with the beastmaster and witch hero classes. Fortresses are built at the edge of swamps. Their armies are primarily made up of deadly creatures – born of the swamps, and then subdued and trained for warfare. Fortress represents Tatalia.",
						Arrays.asList("Beastmaster", "Wiich"),
						Arrays.asList("Gnoll Hut", "Upg. Gnoll Hut", "Lizard Den", "Upg. Lizard Den", "Serpent Fly Hive", "Upg. Serpent Fly Hive", "Basilisk Pit", "Upg. Basilisk Pit", "Gorgon Lair", "Upg. Gorgon Lair", "Wyvern Nest", "Upg. Wyvern Nest", "Hydra Pond", "Upg. Hydra Pond"),
						Arrays.asList("Blood Obelisk", "Cage of Warlords", "Captain's Quarters", "Glyphs of Fear", "Shipyard", "Carnivorous Plant"),
						"Provides 500 " + Resources.GOLD + " per day.", 
						"Provides 1000 " + Resources.GOLD + " per day.",
						"Provides 2000 " + Resources.GOLD + " per day.", 
						"Provides 4000 " + Resources.GOLD + " per day.", 
						"Adds walls to a town", 
						"Adds moat and primary arrow tower to a town. Increases production of creature dwellings by 50%. ", 
						"Adds two secondary arrow towers, standard walls are strengthened to fortified walls. Increases production of creature dwellings by 100%.", 
						"Tavern is a building where a player may hire heroes, visit Thieves' Guild and hear rumors. It also increases morale of the defending hero's army by +1", 
						"Marketplace is structure where a player can trade resources to other resources, or give resources to other players.",
						"Resource silo is one of the standard buildings. It produces additional 1 " + Resources.WOOD.getResource() + " and 1 " + Resources.ORE.getResource() + " per day.",
						"Blacksmith is one of the standard buildings, which can be built in every town. It enables heroes to buy a first aid tent", 
						Arrays.asList(lvl1, lvl2, lvl3, lvl4, lvl5)),
		};
		
		List<Castle> allCastles = Arrays.asList(castles);
		castleDao.deleteAll();
		castleDao.saveAll(allCastles);
		
	}

}
