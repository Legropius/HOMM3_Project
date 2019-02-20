package de.schaefer.creatures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static de.schaefer.creatures.CreatureController.PATHNAME_APPLICATION;

import java.util.List;

@RestController
@RequestMapping(value = PATHNAME_APPLICATION)
public class CreatureController {
	
	static final String PATHNAME_APPLICATION = "/homm3";
	static final String PATHNAME_CREATURE = "/creature";
	private static final String ATTRIBUTE_NAME = "name";
	private static final String ATTRIBUTE_TOWN = "town";
	private static final String ATTRIBUTE_LEVEL = "level";
	
	private final CreatureService creatureService;
	
	@Autowired
	public CreatureController(final CreatureService creatureService) {
		this.creatureService = creatureService;
	}

	@RequestMapping(value = PATHNAME_CREATURE)
	public List<Creature> returnCreatureByName(
			@RequestParam(value = ATTRIBUTE_NAME, required = false, defaultValue = "") String name,
			@RequestParam(value = ATTRIBUTE_TOWN, required = false, defaultValue = "") String town,
			@RequestParam(value = ATTRIBUTE_LEVEL, required = false, defaultValue = "") String level) {
		
		return creatureService.findBy(name.replaceAll("_", " "), town.replaceAll("_", ""), level.replaceAll("_", ""));
	}
}
