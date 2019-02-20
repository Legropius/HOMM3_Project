package de.schaefer.castles.dwellings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static de.schaefer.castles.dwellings.DwellingsController.PATHNAME_APPLICATION;

import java.util.List;

@RestController
@RequestMapping(value = PATHNAME_APPLICATION)
public class DwellingsController {
	
	static final String PATHNAME_APPLICATION = "/homm3";
	static final String PATHNAME_DWELLINGS = "/dwellings";
	private static final String ATTRIBUTE_NAME = "name";
	private static final String ATTRIBUTE_PRODUCES = "produces";
	private static final String ATTRIBUTE_LEVEL = "level";
	
	private final DwellingsService dwellingsService;
	
	@Autowired
	public DwellingsController(final DwellingsService dwellingsService) {
		this.dwellingsService = dwellingsService;
	}
	
	@RequestMapping(value = PATHNAME_DWELLINGS)
	public List<Dwellings> returnDwelling (
			@RequestParam(value = ATTRIBUTE_NAME, required = false, defaultValue = "") String name,
			@RequestParam(value = ATTRIBUTE_PRODUCES, required = false, defaultValue = "") String produces,
			@RequestParam(value = ATTRIBUTE_LEVEL, required = false, defaultValue = "") String level) {
		
		return dwellingsService.findBy(name.replaceAll("_", " "), produces.replaceAll("_", " "), level.replaceAll("_", " "));
	}

}
