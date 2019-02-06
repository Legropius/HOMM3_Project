package de.schaefer.castles;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CastleDao extends JpaRepository<Castle, Integer>{
	
	Optional<List<Castle>> findByNameIgnoreCase(String name);
	
	Optional<List<Castle>> findByNameIgnoreCaseContaining(String name);

}
