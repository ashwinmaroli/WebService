package com.vanomaly.squarerooter.Client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.vanomaly.squarerooter.Server.SquareRootServer;

public class SquareRootClient {
	public static void main(String[] args) {
		SquareRootClient sqrc = new SquareRootClient();
		try {
			sqrc.client("http://127.0.0.1:5335/service?wsdl", 
					new QName("http://Server.squarerooter.vanomaly.com/","SquareRootServerImplService"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void client(String address, QName qname) throws Exception {
		SquareRootClient client = new SquareRootClient();
		URL url = new URL(address);
		double num = 0D;
		Service service = Service.create(url, qname);
		SquareRootServer srs = service.getPort(SquareRootServer.class);
		String dateTime = srs.getTime();
		String sqrt = new Double(srs.getSquareRoot(new Double(client.chop(dateTime)))).toString();
		System.out.println(dateTime);
		System.out.println(sqrt);
	}
	public String chop(String input) {
		input = input.substring(10, 19);
		String[] temp = input.split(":");
		input = "";
		for (int i = 0; i < temp.length; i++) {
			input += temp[i];
		}
		return input;
	}
}
