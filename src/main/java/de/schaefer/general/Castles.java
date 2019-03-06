package de.schaefer.general;

public enum Castles {
	
	CASTLE ("Castle"),
	RAMPART ("Rampart"),
	TOWER ("Tower"),
	INFERNO ("Inferno"),
	NECROPOLIS ("Necropolis"),
	DUNGEON ("Dungeon"),
	STRONGHOLD ("Stronghold"),
	FORTRESS ("Fortress"),
	CONFLUX ("Conflux"),
	COVE ("Cove");
	
	private String castle;

	private Castles(String castle) {
		this.castle = castle;
	};
	
	public String getCastle() {
		return castle;
	}

}
