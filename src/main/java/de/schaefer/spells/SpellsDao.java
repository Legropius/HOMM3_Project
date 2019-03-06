package de.schaefer.spells;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SpellsDao extends MongoRepository<Spells, String>{

	Optional<List<Spells>> findByNameIgnoreCase(String name);
}
