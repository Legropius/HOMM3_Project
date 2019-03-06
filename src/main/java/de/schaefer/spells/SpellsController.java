package de.schaefer.spells;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static de.schaefer.spells.SpellsController.PATHNAME_APPLICATION;

@RestController
@RequestMapping(value = PATHNAME_APPLICATION)
public class SpellsController {
	
	static final String PATHNAME_APPLICATION = "/homm3";
	static final String PATHNAME_SPELLS = "/spells";
	
	private static final String ATTRIBUTE_NAME = "name";
	
	private final SpellsService spellsService;
	
	@Autowired
	public SpellsController(final SpellsService spellsService) {
		this.spellsService = spellsService;
	}
	
	@GetMapping(value = PATHNAME_SPELLS)
	public List<Spells> returnSpell(@RequestParam(value = ATTRIBUTE_NAME, required = false, defaultValue = "") String name){
		
		return spellsService.findBy(name.replaceAll("_", " "));
	}

}
