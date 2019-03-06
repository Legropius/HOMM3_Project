package de.schaefer.spells;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpellsService {
	
	private final SpellsDao spellsDao;

	@Autowired
	public SpellsService(SpellsDao spellsDao) {
		this.spellsDao = spellsDao;
	}
	
	public List<Spells> findBy(String name){
		Optional<List<Spells>> spells = spellsDao.findByNameIgnoreCase(name);
		
		return spells.isPresent() ? spells.get() : null;
	}
	

}
