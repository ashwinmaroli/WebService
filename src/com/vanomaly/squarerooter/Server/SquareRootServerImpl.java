package com.vanomaly.squarerooter.Server;

import javax.jws.WebService;
import java.util.Date;

@WebService(endpointInterface = "com.vanomaly.squarerooter.Server.SquareRootServer")

public class SquareRootServerImpl implements SquareRootServer {
	public double getSquareRoot(double input) {
		return Math.sqrt(input);
	}
	public String getTime() {
		Date now = new Date();
		return now.toString();
	}
}
