package de.schaefer.spells;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import de.schaefer.general.Castles;
import de.schaefer.general.Magic;

@Component
public class SpellsDBSeeder implements CommandLineRunner {
	
	private final SpellsDao spellsDao;
	
	@Autowired
	public SpellsDBSeeder(SpellsDao spellsDao) {
		this.spellsDao = spellsDao;
	}

	@Override
	public void run(String... args) throws Exception {
		
		Spells[] spells = {
				new Spells("Visions", 
						"Displays number of monsters in a wandering monster troop and whether or not the troop will offer to join the casting hero's army.",
						Magic.ALL.getSchool(), 
						2, 
						"1 day",
						Arrays.asList(Castles.CASTLE.getCastle(), Castles.RAMPART.getCastle(), Castles.TOWER.getCastle(), Castles.INFERNO.getCastle(), Castles.NECROPOLIS.getCastle(), Castles.DUNGEON.getCastle(), Castles.STRONGHOLD.getCastle(), Castles.FORTRESS.getCastle(), Castles.CONFLUX.getCastle(), Castles.COVE.getCastle())),
		};
		
		List<Spells> allSpells = Arrays.asList(spells);
		spellsDao.deleteAll();
		spellsDao.saveAll(allSpells);
		
	}

}
