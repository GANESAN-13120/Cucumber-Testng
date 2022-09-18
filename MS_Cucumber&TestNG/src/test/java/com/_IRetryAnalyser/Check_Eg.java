package com._IRetryAnalyser;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Check_Eg implements IRetryAnalyzer  {
	

	    int count=1,limit=5;
		public boolean retry(ITestResult result) {
			
			if(count<=limit) {
				count++;
				return true;
			}
		
			return false;
		}


}
