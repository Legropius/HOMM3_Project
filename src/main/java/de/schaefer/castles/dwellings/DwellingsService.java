package de.schaefer.castles.dwellings;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DwellingsService {
	
	private final DwellingsDao dwellingsDao;
	
	@Autowired
	public DwellingsService(final DwellingsDao dwellingsDao) {
		this.dwellingsDao = dwellingsDao;
	}
	
	public List<Dwellings> findBy(String name, String produces, String level) {
		List<Dwellings> dwellings = dwellingsDao.findAll();
		
		return dwellings
				.stream()
				.parallel()
				.filter(x -> {
					if(!"".equals(name)) {
						return x.getName().toLowerCase().equals(name.toLowerCase());
						} else {
							return true;
						}})
				.filter(x -> {
					if(!"".equals(produces)) {
						return x.getProduces().toLowerCase().equals(produces.toLowerCase());
						} else {
							return true;
						}})
				.filter(x -> {
					if(!"".equals(level)) {
						return x.getLevel().toLowerCase().equals(level.toLowerCase());
						} else {
							return true;
						}})
				.sorted(Comparator.comparing(Dwellings::getLevel))
				.collect(Collectors.toList());
	}

}
