package de.schaefer.skills;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SkillDBSeeder implements CommandLineRunner {
	
	private final SkillsDao skillsDao;
	
	@Autowired
	public SkillDBSeeder(SkillsDao skillsDao) {
		this.skillsDao = skillsDao;
	}

	@Override
	public void run(String... args) throws Exception {
		
		Skills[] skills = {
				new Skills("Basic Air Magic", 
						"Allows your hero to cast air spells at reduced cost.", 
						Arrays.asList("Aenain the Elementalist", "Brissa the Elementalist")),
		};
		
		List<Skills> allSkills = Arrays.asList(skills);
		skillsDao.deleteAll();
		skillsDao.saveAll(allSkills);
	}

}
