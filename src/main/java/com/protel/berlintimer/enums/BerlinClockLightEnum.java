package com.protel.berlintimer.enums;

public enum BerlinClockLightEnum {

	YELLOW("Y"), OFF("O"), RED("R");

	private String value;
	
	BerlinClockLightEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
		
	}
	
}
