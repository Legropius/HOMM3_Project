package de.schaefer.castles;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class CastleDBSeeder implements CommandLineRunner{
	
	private CastleDao castleDao;
	
	@Autowired
	public CastleDBSeeder(CastleDao castleDao) {
		this.castleDao = castleDao;
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Castle[] castles = new Castle[] {
				new Castle("Castle", 
						"villageHall",
						"townHall", 
						"cityHall", 
						"capitol", 
						"fort", 
						"citadel", 
						"castle", 
						"tavern",
						"marketplace", 
						"resourceSilo", 
						"townblacksmith", 
						"mageGuild", 
						4, 
						"creatureGenerator1", 
						"creatureGenerator1plus", 
						"creatureGenerator2", 
						"creatureGenerator2plus", 
						"creatureGenerator3", 
						"creatureGenerator3plus", 
						"creatureGenerator4", 
						"creatureGenerator4plus", 
						"creatureGenerator5", 
						"creatureGenerator5plus", 
						"creatureGenerator6", 
						"creatureGenerator6plus", 
						"creatureGenerator7", 
						"creatureGenerator7plus", 
						"Brotherhood of the Sword - Increases morale by +2 when defending against siege. This is in addition to tavern's +1 resulting in a total morale bonus of +3"),
				
		};
		
		List<Castle> allCastles = Arrays.asList(castles);
		castleDao.deleteAll();
		castleDao.saveAll(allCastles);
		
	}

}
