package com.TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel {
	@Test
	private void Google() {
		System.setProperty("webdriver.chrome.driver"
				,"C:\\Users\\iSHIELD\\eclipse-workspace\\Project\\Chrome_Driver\\chromedriver.exe");
	 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	@Test
	private void Yahoo() {
		System.setProperty("webdriver.chrome.driver"
				,"C:\\Users\\iSHIELD\\eclipse-workspace\\Project\\Chrome_Driver\\chromedriver.exe");
	 
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		driver.manage().window().maximize();
	}
	

}
