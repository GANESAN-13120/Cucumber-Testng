package com.TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	@Test(dataProvider = "Today_Rate")
	private void add(String gold, int gram) {
		System.out.println(gold);
        System.out.println(gram);
	
	}
	@DataProvider
	private Object[][] Today_Rate(){
		return new Object[][]{ 
			{"Earings",10},{"Necklace",40},{"Haram",105}	  
		};
		
	}
}
