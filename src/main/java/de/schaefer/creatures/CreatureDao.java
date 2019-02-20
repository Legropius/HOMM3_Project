package de.schaefer.creatures;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CreatureDao extends MongoRepository<Creature, String>{

}
