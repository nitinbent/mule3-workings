package com.muleex;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IHelloService {

	@WebMethod
	public String helloWorld(String message);
	
}
