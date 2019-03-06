package de.schaefer.items;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
	
	private final ItemDao itemDao;

	@Autowired
	public ItemService(final ItemDao itemDao) {
		this.itemDao = itemDao;
	}
	
	public List<Item> findBy(String name){
		Optional<List<Item>> items = itemDao.findByNameIgnoreCase(name);
		
		return items.isPresent() ? items.get() : null;
	}

}
