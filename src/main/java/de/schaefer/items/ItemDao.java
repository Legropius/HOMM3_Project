package de.schaefer.items;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemDao extends MongoRepository<Item, String>{
	
	Optional<List<Item>> findByNameIgnoreCase(String name);

}
