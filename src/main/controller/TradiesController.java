package main.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import main.com.Service.TradiesServiceImpl;
import main.com.model.Tradies;


@Path("/Tradies")
public class TradiesController {

	
	@GET
	@Produces("application/json")
	@Path("/BrowseTradies")
	public Response TradiesList() {
		String result = null;
		TradiesServiceImpl tradiesImpl = new TradiesServiceImpl();
		ObjectMapper om = new ObjectMapper();
		try {
			Tradies ap = new Tradies();
			ap.setTradies(tradiesImpl.getAllTradiesList());
			result = om.writeValueAsString(ap);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return Response.status(200).entity(result).build();
	}
	
	
	

	

}