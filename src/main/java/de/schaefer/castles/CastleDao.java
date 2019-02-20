package de.schaefer.castles;

import org.springframework.data.mongodb.repository.MongoRepository;
public interface CastleDao extends MongoRepository<Castle, String>{

}
