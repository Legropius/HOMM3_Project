package de.schaefer.creatures;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatureService {

	private CreatureDao creatureDao;

	@Autowired
	public CreatureService(CreatureDao creatureDao) {
		this.creatureDao = creatureDao;
	}

	public List<Creature> findBy(String name, String town, String level) {
		List<Creature> creature = creatureDao.findAll();
		
		return creature
				.stream()
				.parallel()
				.filter(x -> {
					if(!"".equals(name)) {
						return x.getName().toLowerCase().equals(name.toLowerCase());
						} else {
							return true;
						}})
				.filter(x -> {
					if(!"".equals(town)) {
						return x.getTown().toLowerCase().equals(town.toLowerCase());
						} else {
							return true;
						}})
				.filter(x -> {
					if(!"".equals(level)) {
						return x.getLevel().toLowerCase().equals(level.toLowerCase());
						} else {
							return true;
						}})
				.sorted(Comparator.comparing(Creature::getLevel))
				.collect(Collectors.toList());
	}

}
