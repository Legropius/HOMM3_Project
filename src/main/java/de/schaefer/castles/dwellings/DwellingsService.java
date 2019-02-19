package de.schaefer.castles.dwellings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DwellingsService {
	
	private DwellingsDao dwellingsDao;
	
	@Autowired
	public DwellingsService(DwellingsDao dwellingsDao) {
		this.dwellingsDao = dwellingsDao;
	}
	
	public Dwellings findByName(String name) {
		return dwellingsDao.findByName(name).orElse(null);
	}

}
