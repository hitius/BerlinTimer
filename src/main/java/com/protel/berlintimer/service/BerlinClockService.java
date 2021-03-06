package com.protel.berlintimer.service;

import static com.protel.berlintimer.enums.BerlinClockLightEnum.OFF;
import static com.protel.berlintimer.enums.BerlinClockLightEnum.RED;
import static com.protel.berlintimer.enums.BerlinClockLightEnum.YELLOW;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.enterprise.context.ApplicationScoped;

import com.protel.berlintimer.BerlinClock;

@ApplicationScoped
public class BerlinClockService {
	
	private String timePattern = "HH:mm:ss";
	private SimpleDateFormat simpleDateFormat = new SimpleDateFormat(timePattern);
	
	
	/**
	 * 
	 * @param time
	 * @return
	 */
	public String calculationsForBerlinClock(String time) {
		String resultString = "";
		
		// parsing time 
		Date timeAsDate = null;
		if ( time == null ) {
			timeAsDate = new Date();
		} else {
			timeAsDate = parseTime(time);				
		}
		
		if (timeAsDate != null) {
			// formatting time to light color format
			resultString = formatTimeToLightString(timeAsDate).toString();
		} else {
			resultString = "Wrong Data format! Please try HH:mm:ss";
		}
		
		return resultString;
	}

	/**
	 * 
	 * @param timeAsDate
	 * @return
	 */
	private BerlinClock formatTimeToLightString(Date timeAsDate) {
		BerlinClock berlinClock = new BerlinClock();
		
		Calendar calendar = Calendar.getInstance(); 
		calendar.setTime(timeAsDate);
		// getting time values
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		int hourFiveHoursRow = hour / 5;
		int hourSingleHourRow = hour % 5;
		int minuteFiveMinutesRow = minute / 5;
		int minuteSingleMinuteRow = minute % 5;
		
		// calculation second
		berlinClock.setSecond((second % 2 == 1) ? YELLOW.getValue() : OFF.getValue()); 
		// calculation hour rows
		berlinClock.setFiveHoursRow(RED.getValue().repeat(hourFiveHoursRow) + OFF.getValue().repeat(4 - hourFiveHoursRow));
		berlinClock.setOneFullHourRow(RED.getValue().repeat(hourSingleHourRow) + OFF.getValue().repeat(4 - hourSingleHourRow));
		//calculation minute rows
		String minuteString = "";
		for (int i=0;i<minuteFiveMinutesRow;i++) {
			
			if (i == 2 || i == 5 || i== 8) {
				minuteString += RED.getValue();
			} else {
				minuteString += YELLOW.getValue();
			}
			
		}
		
		berlinClock.setFiveMinutesRow(minuteString + OFF.getValue().repeat(11 - minuteFiveMinutesRow));
		berlinClock.setSingleMinutesRow(YELLOW.getValue().repeat(minuteSingleMinuteRow) + OFF.getValue().repeat(4 - minuteSingleMinuteRow));
		
		
		return berlinClock;
	}


	/**
	 * 
	 * @param time
	 * @return
	 */
	private Date parseTime(String time) {
		Date timeAsDate = null;
		try {
			timeAsDate = simpleDateFormat.parse(time);
		} catch (Exception e) {
			System.err.println("Wrong format " + e);
		}
		return timeAsDate;
	}

}
