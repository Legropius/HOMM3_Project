package de.schaefer.castles;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CastleDao extends MongoRepository<Castle, String>{
	
	Optional<List<Castle>> findByNameIgnoreCase(String name);
	
	Optional<List<Castle>> findByNameIgnoreCaseContaining(String name);

}
