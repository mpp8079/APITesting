package com.midtier.testcases;

import org.testng.annotations.Test;

import com.midtier.api.Basic;
import com.midtier.api.TestBasic;

public class GetAvailability extends TestBasic {
    
	
	Basic run = new Basic();
	
	
	@Test
	public void getAvailability(){
		run.getResponse("availability.xml", "getAvailability");
	}
	
}
