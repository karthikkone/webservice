package com.webservice.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.model.Request;
import com.webservice.model.Response;

@RestController
public class DemoController {
	private static final String SHAREDKEY = "sharedkey";
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public static String getMethod() {
		return "Hello, welcome to spring boot!";
	}
	
	@RequestMapping(value="/user", method=RequestMethod.POST)
	public static Response postMethod(@RequestParam("key") String key, @RequestBody Request req) {
		Response res=new Response();
		if(SHAREDKEY.equalsIgnoreCase(key)) {			
			res.setCode(200);
			res.setStatus("Success");
			res.setBody(req.toString());			
		} else {
			res.setCode(202);
			res.setStatus("Error");
			res.setBody("No Response");
		}
		return res;
	}
}
