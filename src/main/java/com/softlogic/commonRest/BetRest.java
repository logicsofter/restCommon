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
	@Produces(MediaType.APPLICATION_JSON)
	Response newPay(String myName);

	@POST
	@Path(value = "/simpleProc")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	String simpleProc(Simple sim);

	@POST
	@Path(value = "/makePayment")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	AccountResp makePayment(AccountDetails myAccount);

	
}
