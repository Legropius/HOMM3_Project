package de.schaefer.castles;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CastleService {
	
	private final CastleDao castleDao;
	
	@Autowired
	public CastleService(final CastleDao castleDao) {
		this.castleDao = castleDao;
	}
	
	public List<Castle> findBy(String name){
		
		Optional<List<Castle>> castle = castleDao.findByNameIgnoreCase(name);
		
		return castle.isPresent() ? castle.get() : null;
	}

}
