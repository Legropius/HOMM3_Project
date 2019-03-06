package de.schaefer.items;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import de.schaefer.general.Artifact;
import de.schaefer.general.Resources;
import de.schaefer.general.Slot;

@Component
public class ItemDBSeeder implements CommandLineRunner {
	
	private final ItemDao itemDao;
	
	@Autowired
	public ItemDBSeeder(final ItemDao itemDao) {
		this.itemDao = itemDao;
	}

	@Override
	public void run(String... args) throws Exception {
		
		Item[] items = {
				new Item("Cape of Conjuring",
						Slot.CAPE.getSlot(), 
						Artifact.TREASURE.getQuality(),
						"1500 " + Resources.GOLD.getResource(), 
						"Spell duration +3", 
						"Part of Ring of the Magi"),
		};
		
		
		List<Item> allItems = Arrays.asList(items);
		itemDao.deleteAll();
		itemDao.saveAll(allItems);
	}

}
