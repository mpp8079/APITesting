package com.midtier.api;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class TestBasic {
	
	private static Logger logs = LogManager.getLogger(TestBasic.class.getName());
	
	public static Properties prop;
	public static String userDirectory = System.getProperty("user.dir");
	
	public TestBasic() {
		prop = new Properties();
		
		try {
			FileInputStream input = new FileInputStream(userDirectory+"\\src\\test\\resources\\Properties\\config.properties");
			prop.load(input);
			
		} catch (Exception e) {
			
			logs.error("File Not found");
		}
		
	}
	
	public static String getRequestPaylod(String payload) {
		String test = null;
	    try {
		test=  new String(Files.readAllBytes(Paths.get(userDirectory+"\\src\\test\\resources\\RequestPayload\\"+payload)));
		} catch (IOException e) {
			logs.error("Payload Not found");
		}
		return test;

	}
	
}
