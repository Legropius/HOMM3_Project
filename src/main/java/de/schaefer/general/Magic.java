package de.schaefer.general;

public enum Magic {
	
	EARTH ("School of Earth Magic"),
	FIRE ("SChool of Fire Magic"),
	WATER ("School of Water Magic"),
	AIR ("School of Air Magic"),
	ALL ("All Schools of Magic");
	
	private String school;

	private Magic(String school) {
		this.school = school;
	}
	
	public String getSchool() {
		return school;
	}

}
