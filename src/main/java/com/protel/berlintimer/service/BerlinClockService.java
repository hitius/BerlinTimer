package com.protel.berlintimer.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.enterprise.context.ApplicationScoped;

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
		String result = null;
		
		// parsing time 
		Date timeAsDate = parseTime(time);
		
		if (timeAsDate != null) {
			// formatting time to light color format
			result = formatTimeToLightString(timeAsDate);
		} else {
			// TODO: typo
			result = "Wrong format";
		}
		
		return result;
	}

	/**
	 * 
	 * @param timeAsDate
	 * @return
	 */
	private String formatTimeToLightString(Date timeAsDate) {
		
		
		
		return null;
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
			e.printStackTrace();
		}
		return timeAsDate;
	}

}
