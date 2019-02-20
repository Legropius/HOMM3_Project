package de.schaefer.castles;

import java.util.List;

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
		
		return null;
	}

}
