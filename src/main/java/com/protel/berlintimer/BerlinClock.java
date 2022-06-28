package com.protel.berlintimer;

public class BerlinClock {
	
	// http://www.3quarks.com/en/BerlinClock/
	private String second;
	private String fiveHoursRow;
	private String oneFullHourRow;
	private String fiveMinutesRow;
	private String singleMinutesRow;
	
	public String getSecond() {
		return second;
	}
	public void setSecond(String second) {
		this.second = second;
	}
	public String getFiveHoursRow() {
		return fiveHoursRow;
	}
	public void setFiveHoursRow(String fiveHoursRow) {
		this.fiveHoursRow = fiveHoursRow;
	}
	public String getOneFullHourRow() {
		return oneFullHourRow;
	}
	public void setOneFullHourRow(String oneFullHourRow) {
		this.oneFullHourRow = oneFullHourRow;
	}
	public String getFiveMinutesRow() {
		return fiveMinutesRow;
	}
	public void setFiveMinutesRow(String fiveMinutesRow) {
		this.fiveMinutesRow = fiveMinutesRow;
	}
	public String getSingleMinutesRow() {
		return singleMinutesRow;
	}
	public void setSingleMinutesRow(String singleMinutesRow) {
		this.singleMinutesRow = singleMinutesRow;
	}
	
	@Override
	public String toString() {
		return "BerlinClock [second=" + second + ", fiveHoursRow=" + fiveHoursRow + ", oneFullHourRow=" + oneFullHourRow
				+ ", fiveMinutesRow=" + fiveMinutesRow + ", singleMinutesRow=" + singleMinutesRow + "]";
	}
	
	

}
