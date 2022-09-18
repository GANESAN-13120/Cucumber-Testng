package com._IRetryAnalyser;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class V_V_model {
	
	 @Test
	  
		private void add() {
			//HardAssert
			String actual = "Ganesan";
			String expected =""; 
			
	        Assert.assertEquals( actual, expected);
			//Assert.assertNotEquals(actual,expected );
			
			//softAssert
			
			//SoftAssert soft = new SoftAssert();
			//soft.assertEquals(actual,expected);
		}

}
