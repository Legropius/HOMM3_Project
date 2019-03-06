package de.schaefer.castles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static de.schaefer.castles.CastleController.PATHNAME_APPLICATION;

@RestController
@RequestMapping(value = PATHNAME_APPLICATION)
public class CastleController {
	
	static final String PATHNAME_APPLICATION = "/homm3";
	static final String PATHNAME_CASTLE = "/castle";
	
	private static final String ATTRIBUTE_NAME = "name";
	
	private final CastleService castleService;
	
	@Autowired
	public CastleController(final CastleService castleService) {
		this.castleService = castleService;
	}
	
	@GetMapping(value = PATHNAME_CASTLE)
	public List<Castle> returnCastle(@RequestParam(value = ATTRIBUTE_NAME, required = false, defaultValue = "") String name){
		
		return castleService.findBy(name.replaceAll("_", " "));
	}

}
