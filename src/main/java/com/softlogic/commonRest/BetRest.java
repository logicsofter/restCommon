package com.softlogic.commonRest;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
 * 
 * Exposes a CXF betting interface
 * 
 */
public interface BetRest 
{
	@GET
	@Path(value = "/healthCheck/{callerID}")
	Integer healthCheck(@PathParam("callerID")String callerID);
	
	@POST
	@Path(value = "/sayHello")
	Boolean sayHello(String myName);
	
	@POST
	@Path(value = "/newPay")
	Response newPay(String myName);

	@POST
	@Path(value = "/simpleProc")
	//
	// Client does not honor this
	// must set content_type header to json 
	//
	@Consumes(MediaType.APPLICATION_JSON)
	String simpleProc(Simple sim);

	@POST
	@Path(value = "/makePayment")
	//
	// This is required or the server will rely 
	// on the clients "Accept" content type to marshal the response
	//
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	AccountResp makePayment(AccountDetails myAccount);

	
}
