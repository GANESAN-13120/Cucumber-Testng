package com.TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class V_and_V {
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
