package de.schaefer.creatures;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import de.schaefer.general.Resources;

@Component
public class CreatureSeeder implements CommandLineRunner {
	
	private final CreatureDao creatureDao;
	
	@Autowired
	public CreatureSeeder(CreatureDao creatureDao) {
		this.creatureDao = creatureDao;
	}
	

	@Override
	public void run(String... args) throws Exception {
		
		Creature[] creatures = new Creature[] {
				new Creature("Pikeman",
						"Castle", 
						"1", 
						4, 
						5,
						1, 
						3, 
						10, 
						4, 
						14, 
						80, 
						"60 " + Resources.GOLD.getResource()),
				
				new Creature("Halberdier",
						"Castle", 
						"1+", 
						6, 
						5,
						2, 
						3, 
						10, 
						5, 
						14, 
						115, 
						"75 " + Resources.GOLD.getResource()),
		
				new Creature("Archer",
						"Castle", 
						"2", 
						6, 
						3,
						2, 
						3, 
						10, 
						4, 
						9, 
						126, 
						"100 " + Resources.GOLD.getResource()),
				
				new Creature("Marksman",
						"Castle", 
						"2+", 
						6, 
						3,
						2, 
						3, 
						10, 
						6, 
						9, 
						184, 
						"150 " + Resources.GOLD.getResource()),
				
				new Creature("Griffin",
						"Castle", 
						"3", 
						8, 
						8,
						3, 
						6, 
						25, 
						6, 
						7, 
						351, 
						"200 " + Resources.GOLD.getResource()),
				
				new Creature("Royal Griffin",
						"Castle", 
						"3+", 
						9, 
						9,
						3, 
						6, 
						25, 
						9, 
						7, 
						448, 
						"240 " + Resources.GOLD.getResource()),
				
				new Creature("Swordsman",
						"Castle", 
						"4", 
						10, 
						12,
						6, 
						9, 
						35, 
						5, 
						4, 
						445, 
						"240 " + Resources.GOLD.getResource()),
				
				new Creature("Crusader",
						"Castle", 
						"4+", 
						12, 
						12,
						7, 
						10, 
						35, 
						6, 
						4, 
						558, 
						"400 " + Resources.GOLD.getResource()),
				
				new Creature("Monk",
						"Castle", 
						"5", 
						12, 
						7,
						10, 
						12, 
						30, 
						3, 
						3, 
						485, 
						"400 " + Resources.GOLD.getResource()),
				
				new Creature("Zealot",
						"Castle", 
						"5+", 
						12, 
						10,
						10, 
						12, 
						30, 
						7, 
						3, 
						750, 
						"450 " + Resources.GOLD.getResource()),
				
				new Creature("Cavalier",
						"Castle", 
						"6", 
						15, 
						15,
						15, 
						25, 
						100, 
						7, 
						2, 
						1946, 
						"1000 " + Resources.GOLD.getResource()),
				
				new Creature("Champion",
						"Castle", 
						"6+", 
						16, 
						16,
						20, 
						25, 
						100, 
						9, 
						2, 
						2100, 
						"1200 " + Resources.GOLD.getResource()),
				
				new Creature("Angel",
						"Castle", 
						"7", 
						20, 
						20,
						50, 
						50, 
						200, 
						12, 
						1, 
						5019, 
						"3000 " + Resources.GOLD.getResource() + ", 1 " + Resources.GEMS.getResource()),
				
				new Creature("Archangel",
						"Castle", 
						"7+", 
						30, 
						30,
						50, 
						50, 
						250, 
						18, 
						1, 
						8776, 
						"3000 " + Resources.GOLD.getResource() + ", 1 " + Resources.GEMS.getResource()),
		};
		
		List<Creature> allCreatures = Arrays.asList(creatures);
		creatureDao.deleteAll();
		creatureDao.saveAll(allCreatures);
		
	}

}
