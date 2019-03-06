package de.schaefer.skills;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static de.schaefer.skills.SkillsController.PATHNAME_APPLICATION;

import java.util.List;

@RestController
@RequestMapping(value = PATHNAME_APPLICATION)
public class SkillsController {

	static final String PATHNAME_APPLICATION = "/homm3";
	static final String PATHNAME_SKILLS = "/skills";
	
	private static final String ATTRIBUTE_NAME = "name";
	
	private final SkillsService skillsService;

	@Autowired
	public SkillsController(final SkillsService skillsService) {
		this.skillsService = skillsService;
	}
	
	@GetMapping(value = PATHNAME_SKILLS)
	public List<Skills> returnSkills(@RequestParam(value = ATTRIBUTE_NAME, required = false, defaultValue = "") String name) {
		
		return skillsService.findBy(name.replaceAll("_", " "));
	}
	
	
}
