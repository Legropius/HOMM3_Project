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
		
		MageGuild lvl1 = new MageGuild("Mage Guild", 1);
		MageGuild lvl2 = new MageGuild("Mage Guild", 2);
		MageGuild lvl3 = new MageGuild("Mage Guild", 3);
		MageGuild lvl4 = new MageGuild("Mage Guild", 4);
		MageGuild lvl5 = new MageGuild("Mage Guild", 5);
		
		/*Castle[] castles = {
				new Castle(
						info, 
						heroClasses, 
						creatureDwellings,
						specificBuildings, 
						villageHall, 
						townHall, 
						cityHall, 
						capitol, 
						fort, 
						citadel,
						castle,
						tavern, 
						marketplace,
						resourceSilo, 
						blacksmith, 
						mageGuilds
						)
		};
		
		List<Castle> allCastles = Arrays.asList(castles);
		castleDao.deleteAll();
		castleDao.saveAll(allCastles);*/
		
	}

}
