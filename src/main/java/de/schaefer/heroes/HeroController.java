package de.schaefer.heroes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static de.schaefer.heroes.HeroController.PATHNAME_APPLICATION;

@RestController
@RequestMapping(value = PATHNAME_APPLICATION)
public class HeroController {
	
	static final String PATHNAME_APPLICATION = "/homm3";
	static final String PATHNAME_HERO = "/hero";
	
	private static final String ATTRIBUTE_NAME = "name";
	
	private final HeroService heroService;

	@Autowired
	public HeroController(final HeroService heroService) {
		this.heroService = heroService;
	}
	
	@GetMapping(value = PATHNAME_HERO)
	public List<Hero> returnHero(@RequestParam(value = ATTRIBUTE_NAME, required = false, defaultValue = "") String name){
		
		return heroService.findBy(name.replaceAll("_", " "));
	}
	
	
	

}
