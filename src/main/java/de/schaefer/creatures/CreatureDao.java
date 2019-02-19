package de.schaefer.creatures;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CreatureDao extends MongoRepository<Creature, String>{
	
	public Optional<Creature> findByName(String name);

}
