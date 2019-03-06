package de.schaefer.general;

public enum Slot {

	CAPE ("Cape"),
	COMBO ("Combination"),
	FEET ("Feet"),
	HELM ("Helm"),
	SHIELD ("Shield"),
	MISC ("Misc"),
	NECKLACE ("Necklace"),
	WEAPON ("Weapon"),
	RING ("Ring"),
	TORSO ("Torso");

	private final String slot;
	
	Slot(String slot){
		this.slot = slot;
	}

	public String getSlot() {
		return slot;
	}
}
