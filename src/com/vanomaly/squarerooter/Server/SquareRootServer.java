package com.vanomaly.squarerooter.Server;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService

@SOAPBinding(style = Style.RPC)

public interface SquareRootServer {
	// get the square root of a number
	@WebMethod double getSquareRoot(double input);
	// get the current time and date as a string
	@WebMethod String getTime();
}
