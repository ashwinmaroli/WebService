package com.vanomaly.squarerooter.Server;

import javax.xml.ws.Endpoint;

public class SquareRootServerPublisher {
	public static void main (String[] args) {
		SquareRootServerPublisher sqrsp = new SquareRootServerPublisher();
		sqrsp.initial("http://127.0.0.1:5335/service");
	}
	public void initial(String address) {
		SquareRootServerImpl implementor = new SquareRootServerImpl();
		Endpoint.publish(address, implementor);
	}
}
