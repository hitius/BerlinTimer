package com.protel.berlintimer;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.protel.berlintimer.service.BerlinClockService;


@Path("/api")
public class BerlinClockController {

	@Inject
	BerlinClockService berlinClockService;

	/**
	 * 
	 * @param time
	 * @return
	 */
	@GET
	@Path("/berlinClock")
	@Produces(MediaType.TEXT_PLAIN)
	public String berlinClock(@QueryParam(value = "time") String time) {

		return berlinClockService.calculationsForBerlinClock(time);
	}    
    
}