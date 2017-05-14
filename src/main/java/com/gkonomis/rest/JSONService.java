package com.gkonomis.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.gkonomis.Converter;

import Controller.NumMatcher;
import Controller.Numberizer;

@Path("/perfectmatcher")
public class JSONService {

	Converter converter = new Converter();
	public static int value;
	public static String female;

	@POST
	@Path("/numberizer/{paramvalue}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public int getNumberizerJSON(@PathParam("paramvalue") String paramvalue) {

		value = Numberizer.numberizer(paramvalue);
		converter.setAsciiValue(value);
		int asciiValue = converter.getAsciiValue();

		System.out.println(asciiValue);
		return value;

	}

	@GET
	@Path("/nummatcher")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String getNumMatcherJSON() {

		female = NumMatcher.numMatcher(value);
		converter.setFemalename(female);
		female = converter.getFemalename();

		System.out.println(female);
		return female;

	}

}