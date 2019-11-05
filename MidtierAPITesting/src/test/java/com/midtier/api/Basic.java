package com.midtier.api;

import static io.restassured.RestAssured.given;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class Basic extends TestBasic {
	
	
	private static Logger logs = LogManager.getLogger(Basic.class.getName());

	

	public void getResponse(String payload , String endpoint) {
		String url = RestAssured.baseURI= prop.getProperty("basicUrl");
		Response response = 
				given().
				contentType(ContentType.XML).
				accept(ContentType.XML).
				body(getRequestPaylod(payload)).
				when().
				post(prop.getProperty(endpoint)).
				then().
				statusCode(200).
				extract().
				response();	
		      
			   logs.info("Endpoint: "+url+prop.getProperty(endpoint));
			   logs.info("HTTP Request: "+"POST");
			   logs.info("Request: "+getRequestPaylod(payload));
	           logs.info("Response: "+response.asString());				
	           logs.info(response.statusCode());
	}
	
	
	


}
