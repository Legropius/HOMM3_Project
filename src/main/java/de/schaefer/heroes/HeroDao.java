package de.schaefer.heroes;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface HeroDao extends MongoRepository<Hero, String>{

	Optional<List<Hero>> findByNameIgnoreCase(String name);
}
