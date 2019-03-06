package de.schaefer.skills;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SkillsDao extends MongoRepository<Skills, String>{

	Optional<List<Skills>> findByNameIgnoreCase(String name);
}
