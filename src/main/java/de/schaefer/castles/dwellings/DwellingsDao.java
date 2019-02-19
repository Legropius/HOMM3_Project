package de.schaefer.castles.dwellings;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DwellingsDao extends MongoRepository<Dwellings, String> {

	public Optional<Dwellings> findByName(String name);
}
