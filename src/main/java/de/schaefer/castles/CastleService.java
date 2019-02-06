package de.schaefer.castles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CastleService {
	
	private CastleDao castleDao;
	
	@Autowired
	public CastleService(CastleDao castleDao) {
		this.castleDao = castleDao;
	}
	
	public List<Castle> findByName(String name){
		
		return castleDao.findByNameIgnoreCase(name)
				.orElse(castleDao.findByNameIgnoreCaseContaining(name).orElse(null));
	}

}
