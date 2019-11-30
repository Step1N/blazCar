package com.blazcar.washer.domain;

import com.blazcar.washer.common.base.BaseDomain;

public class TimeSlot extends BaseDomain{

	private String startHour;
	private String startMinute;
	private String startSec;

	private String endHour;
	private String endMinute;
	private String endSec;
	
	public TimeSlot(String startHour, String startMinute, String startSec, String endHour, String endMinute,
			String endSec) {
		super();
		this.startHour = startHour;
		this.startMinute = startMinute;
		this.startSec = startSec;
		this.endHour = endHour;
		this.endMinute = endMinute;
		this.endSec = endSec;
	}
	
	public String getStartHour() {
		return startHour;
	}
	public void setStartHour(String startHour) {
		this.startHour = startHour;
	}
	public String getStartMinute() {
		return startMinute;
	}
	public void setStartMinute(String startMinute) {
		this.startMinute = startMinute;
	}
	public String getStartSec() {
		return startSec;
	}
	public void setStartSec(String startSec) {
		this.startSec = startSec;
	}
	public String getEndHour() {
		return endHour;
	}
	public void setEndHour(String endHour) {
		this.endHour = endHour;
	}
	public String getEndMinute() {
		return endMinute;
	}
	public void setEndMinute(String endMinute) {
		this.endMinute = endMinute;
	}
	public String getEndSec() {
		return endSec;
	}
	public void setEndSec(String endSec) {
		this.endSec = endSec;
	}
}
