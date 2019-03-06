package de.schaefer.skills;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService {
	
	private final SkillsDao skillsDao;

	@Autowired
	public SkillsService(SkillsDao skillsDao) {
		this.skillsDao = skillsDao;
	}
	
	public List<Skills> findBy(String name){
		Optional<List<Skills>> skills = skillsDao.findByNameIgnoreCase(name);
		
		return skills.isPresent() ? skills.get() : null;
	}
	
	

}
