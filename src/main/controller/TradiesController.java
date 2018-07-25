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
	
	
	/*@GET
	@Produces("application/json")
	@Path("/Oauth")
	public Response Oauth() {
		String result = null;
		TradiesServiceImpl apImpl = new TradiesServiceImpl();
		ObjectMapper om = new ObjectMapper();
		try {
			Airports ap = new Airports();
			ap.setAirports(apImpl.getAllAirports());
			result = om.writeValueAsString(ap);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return Response.status(200).entity(result).build();
	}
	*/
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
	
	
	

	/*@GET
	@Produces("application/json")
	@Path("/airports/searchbyCode/{code}")
	public Response getAirportbyCode(@PathParam("code") String Code) {

		String result = null;
		AirportServiceImpl apImpl = new AirportServiceImpl();
		Airport ap = null;
		ObjectMapper om = new ObjectMapper();
		try {
			ap = apImpl.getAirportbyCode(Code);
			result = om.writeValueAsString(ap);

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return Response.status(200).entity(result).build();
	}

	@GET
	@Produces("application/json")
	@Path("/airports/searchbyCountry/{cntry}")
	public Response getAirportbyCountry(@PathParam("cntry") String country) {
		String result = null;
		AirportServiceImpl apImpl = new AirportServiceImpl();
		ObjectMapper om = new ObjectMapper();
		Airports ap = new Airports();

		try {
			List<Airport> lsAp = apImpl.getAirportbyCountry(country);
			if(lsAp.size()>0){
			ap.setAirports(lsAp);}
			result = om.writeValueAsString(ap);

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return Response.status(200).entity(result).build();
	}

	@GET
	@Produces("application/json")
	@Path("/airports/intlAirports")
	public Response getIntlAirports() {
		String result = null;
		AirportServiceImpl apImpl = new AirportServiceImpl();
		ObjectMapper om = new ObjectMapper();
		try {
			Airports ap = new Airports();
			List<Airport> lsAp = apImpl.getInternationalAirport();
			ap.setAirports(lsAp);

			result = om.writeValueAsString(ap);

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return Response.status(200).entity(result).build();
	}

	@GET
	@Produces("application/json")
	@Path("/airports/regAirports")
	public Response getregAirports() {
		String result = null;
		AirportServiceImpl apImpl = new AirportServiceImpl();
		ObjectMapper om = new ObjectMapper();
		String result1 = result;
		try {
			Airports ap = new Airports();
			List<Airport> lsAp = apImpl.getRegionalAirport();
			ap.setAirports(lsAp);
			result1 = om.writeValueAsString(ap);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		result = result1;
		return Response.status(200).entity(result).build();
	}*/

}