package de.schaefer.items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static de.schaefer.items.ItemController.PATHNAME_APPLICATION;

import java.util.List;

@RestController
@RequestMapping(value = PATHNAME_APPLICATION)
public class ItemController {

	static final String PATHNAME_APPLICATION = "/homm3";
	static final String PATHNAME_ITEM = "/item";
	
	private static final String ATTRIBUTE_NAME = "name";
	
	private final ItemService itemService;

	@Autowired
	public ItemController(ItemService itemService) {
		this.itemService = itemService;
	}
	
	@GetMapping(value = PATHNAME_ITEM)
	public List<Item> returnItem(@RequestParam(value = ATTRIBUTE_NAME, required = false, defaultValue = "") String name) {
		
		return itemService.findBy(name.replaceAll("_", " "));
	}
	
	
}
