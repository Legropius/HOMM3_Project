package de.schaefer.castles.dwellings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class DwellingsSeeder implements CommandLineRunner {
	
	private DwellingsDao DwellingsDao;
	
	@Autowired
	public DwellingsSeeder(DwellingsDao dwellingsDao) {
		this.DwellingsDao = dwellingsDao;
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}

}
