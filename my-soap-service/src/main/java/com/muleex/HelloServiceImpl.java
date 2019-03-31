package com.muleex;

import javax.jws.WebService;

@WebService
public class HelloServiceImpl implements IHelloService{

	@Override
	public String helloWorld(String message) {
		return message +" Hello, This is SOAP service from Mule";
	}
	
	

}
