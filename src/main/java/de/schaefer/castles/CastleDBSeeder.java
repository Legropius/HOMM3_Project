package de.schaefer.castles;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class CastleDBSeeder implements CommandLineRunner{
	
	private final CastleDao castleDao;
	
	@Autowired
	public CastleDBSeeder(final CastleDao castleDao) {
		this.castleDao = castleDao;
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		/*Castle[] castles = {
				
		};
		
		List<Castle> allCastles = Arrays.asList(castles);
		castleDao.deleteAll();
		castleDao.saveAll(allCastles);*/
		
	}

}
