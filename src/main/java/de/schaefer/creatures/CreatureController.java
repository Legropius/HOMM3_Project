package de.schaefer.creatures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static de.schaefer.creatures.CreatureController.PATHNAME_CREATURE;

@RestController
@RequestMapping(value = PATHNAME_CREATURE)
public class CreatureController {
	
	static final String PATHNAME_CREATURE = "/creature";
	private static final String ATTRIBUTE_NAME = "name";
	
	private final CreatureService creatureService;
	
	@Autowired
	public CreatureController(final CreatureService creatureService) {
		this.creatureService = creatureService;
	}

	@GetMapping
	public Creature returnCreature(@RequestParam(value = ATTRIBUTE_NAME, defaultValue = "") String name) {
		return creatureService.findByName(name);
	}
}
