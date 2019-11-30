package com.blazcar.washer.constant;

import com.blazcar.washer.domain.TimeSlot;

public enum TimeSlotEnum {

	SLOT1("","","","","",""),
	SLOT2("","","","","",""),
	SLOT3("","","","","",""),
	SLOT4("","","","","","");

	private TimeSlot slot;

	private TimeSlotEnum(String startHour, String startMinute, String startSec, String endHour, String endMinute,
			String endSec) {
		this.slot = new TimeSlot( startHour,  startMinute,  startSec,  endHour,  endMinute,
				endSec);
	}

	public TimeSlot getSlot() {
		return slot;
	} 
}
