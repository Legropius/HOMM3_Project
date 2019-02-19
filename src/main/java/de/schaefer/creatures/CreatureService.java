package de.schaefer.creatures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatureService {
	
	private CreatureDao creatureDao;
	
	@Autowired
	public CreatureService(CreatureDao creatureDao) {
		this.creatureDao = creatureDao;
	}
	
	public Creature findByName(String name) {
		return creatureDao.findByName(name).orElse(null);
	}

}
