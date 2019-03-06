package de.schaefer.heroes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeroService {

	private final HeroDao heroDao;

	@Autowired
	public HeroService(final HeroDao heroDao) {
		this.heroDao = heroDao;
	}
	
	public List<Hero> findBy(String name){
		Optional<List<Hero>> hero = heroDao.findByNameIgnoreCase(name);
		
		return hero.isPresent() ? hero.get() : null;
	}
}
