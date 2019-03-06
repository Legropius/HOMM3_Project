package de.schaefer.heroes;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HeroDBSeeder implements CommandLineRunner {
	
	private final HeroDao heroDao;
	
	@Autowired
	public HeroDBSeeder(final HeroDao heroDao) {
		this.heroDao = heroDao;
	}

	@Override
	public void run(String... args) throws Exception {
		
		Hero[] heroes = {
				new Hero("Christian", 
						"Male",
						"Human",
						"Christian was always more of a frontiersman than a Knight, having set foot in nearly every part of Enroth before finally settling into military service in Erathia. Though a wanderer and a bit of a dreamer, his battlefield tactics are feared throughout the world.", 
						"Specialty Ballista - Increases the Attack and Defense skills of any Ballista by 5% for every 5 levels (rounded up). ",
						Arrays.asList("Basic Leadership", "Basic Artillery"),
						Arrays.asList("Pikeman 10–20 Always", "Griffin 2–3 1/4"), 
						Arrays.asList("Ballista")),
		};
		
		List<Hero> allHeroes = Arrays.asList(heroes);
		heroDao.deleteAll();
		heroDao.saveAll(allHeroes);
	}

}
