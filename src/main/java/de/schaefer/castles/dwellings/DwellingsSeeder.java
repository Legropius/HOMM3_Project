package de.schaefer.castles.dwellings;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import de.schaefer.general.Resources;

@Component
public class DwellingsSeeder implements CommandLineRunner {
	
	private final DwellingsDao dwellingsDao;
	
	@Autowired
	public DwellingsSeeder(final DwellingsDao dwellingsDao) {
		this.dwellingsDao = dwellingsDao;
	}

	@Override
	public void run(String... args) throws Exception {
		
		Dwellings[] dwellings = new Dwellings[] {
				new Dwellings("Guardhouse",
						"1",
						"10 " + Resources.ORE.getResource() + ", 500 " + Resources.GOLD.getResource(), 
						Arrays.asList("Fort"), 
						"Pikeman"),
				
				new Dwellings("Upg. Guardhouse",
						"1+",
						"5 " + Resources.ORE.getResource() + ", 1000 " + Resources.GOLD.getResource(), 
						Arrays.asList("Guardhouse"), 
						"Halberdier"),
				
				new Dwellings("Archers' Tower",
						"2",
						"5 " + Resources.WOOD.getResource() + ", 5 " +Resources.ORE.getResource() + ", 1000 " + Resources.GOLD.getResource(), 
						Arrays.asList("Guardhouse"), 
						"Archer"),
				
				new Dwellings("Upg. Archers' Tower",
						"2+",
						"5 " + Resources.WOOD.getResource() + ", 5 " +Resources.ORE.getResource() + ", 1000 " + Resources.GOLD.getResource(), 
						Arrays.asList("Archers' Tower"), 
						"Marksman"),
				
				new Dwellings("Griffin Tower",
						"3",
						"5 " + Resources.ORE.getResource() + ", 1000 " + Resources.GOLD.getResource(), 
						Arrays.asList("Barracks"), 
						"Griffin"),
				
				new Dwellings("Upg. Griffin Tower",
						"3+",
						"5 " + Resources.ORE.getResource() + ", 1000 " + Resources.GOLD.getResource(), 
						Arrays.asList("Griffin Tower"), 
						"Royal Griffin"),
				
				new Dwellings("Barracks",
						"4",
						"5 " + Resources.ORE.getResource() + ", 2000 " + Resources.GOLD.getResource(), 
						Arrays.asList("Guardhouse", "Blacksmith"), 
						"Swordsman"),
				
				new Dwellings("Upg. Barracks",
						"4+",
						"5 " + Resources.ORE.getResource() + ", 5 " + Resources.CRYSTAL.getResource() + ", 2000 " + Resources.GOLD.getResource(), 
						Arrays.asList("Barracks"), 
						"Crusader"),
				
				new Dwellings("Monastery",
						"5",
						"5 " + Resources.WOOD.getResource() + ", 2 " + Resources.MERCURY.getResource() + ", 5 " + Resources.ORE.getResource() + ", 2 " + Resources.SULFUR.getResource() + ", 2 " + Resources.CRYSTAL.getResource() + ", 2 " + Resources.GEMS.getResource() + ", 3000 " + Resources.GOLD.getResource(), 
						Arrays.asList("Mage Guild", "Barracks"), 
						"Monk"),
				
				new Dwellings("Upg. Monastery",
						"5+",
						"2 " + Resources.WOOD.getResource() + ", 2 " + Resources.MERCURY.getResource() + ", 2 " + Resources.ORE.getResource() + ", 2 " + Resources.SULFUR.getResource() + ", 2 " + Resources.CRYSTAL.getResource() + ", 2 " + Resources.GEMS.getResource() + ", 1000 " + Resources.GOLD.getResource(), 
						Arrays.asList("Monastery"), 
						"Zealot"),
				
				new Dwellings("Training Grounds",
						"6",
						"20 " + Resources.WOOD.getResource() + ", 5000 " + Resources.GOLD.getResource(), 
						Arrays.asList("Stables", "Barracks"), 
						"Cavalier"),
				
				new Dwellings("Upg. Training Grounds",
						"6+",
						"10 " + Resources.WOOD.getResource() + ", 3000 " + Resources.GOLD.getResource(), 
						Arrays.asList("Training Grounds"), 
						"Champion"),
				
				new Dwellings("Portal of Glory",
						"7",
						"10 " + Resources.MERCURY.getResource() + ", 10 " + Resources.SULFUR.getResource() + ", 10 " + Resources.CRYSTAL.getResource() + ", 10 " + Resources.GEMS.getResource() + ", 20000 " + Resources.GOLD.getResource(), 
						Arrays.asList("Monastery"), 
						"Angel"),
				
				new Dwellings("Upg. Portal of Glory",
						"7+",
						"10 " + Resources.MERCURY.getResource() + ", 10 " + Resources.SULFUR.getResource() + ", 10 " + Resources.CRYSTAL.getResource() + ", 10 " + Resources.GEMS.getResource() + ", 20000 " + Resources.GOLD.getResource(), 
						Arrays.asList("Portal of Glory"), 
						"Archangel"),
		};
		
		List<Dwellings> allDwellings = Arrays.asList(dwellings);
		dwellingsDao.deleteAll();
		dwellingsDao.saveAll(allDwellings);
	}

}
