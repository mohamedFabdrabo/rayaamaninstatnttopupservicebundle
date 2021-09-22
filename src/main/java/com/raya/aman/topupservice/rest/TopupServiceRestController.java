package com.raya.aman.topupservice.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.raya.aman.topupservice.dto.TopupRequestDto;

@Path("/")
public class TopupServiceRestController {
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/charge/")
	@Produces(MediaType.APPLICATION_JSON)
	public void chargeTopupforMobil(
			TopupRequestDto TopupRequestDto) {
		return;
	}

}
