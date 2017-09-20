package com.bmwfs.rest.example.controller;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.bmwfs.rest.example.bean.ExceptionMessage;
import com.bmwfs.rest.example.exception.CountryNotFoundException;

@Provider
public class CountryNotFoundExceptionMapper implements ExceptionMapper<CountryNotFoundException>{

	@Override
	public Response toResponse(CountryNotFoundException cnfe) {
		
		ExceptionMessage exceptionMessage= new ExceptionMessage(cnfe.getExceptionMessage(),"404");
		return Response.status(Status.NOT_FOUND).entity(exceptionMessage).build();
	}

	
}
