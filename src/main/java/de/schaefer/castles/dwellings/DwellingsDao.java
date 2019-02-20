package de.schaefer.castles.dwellings;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DwellingsDao extends MongoRepository<Dwellings, String> {
}
