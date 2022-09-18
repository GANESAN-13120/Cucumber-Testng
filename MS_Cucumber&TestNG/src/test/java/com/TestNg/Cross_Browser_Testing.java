package com.TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Cross_Browser_Testing {
	
	@Test
	private void Chrome() {
		System.setProperty("webdriver.chrome.driver"
				,"C:\\Users\\iSHIELD\\eclipse-workspace\\Project\\Chrome_Driver\\chromedriver.exe");
	 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	@Test
	private void Firefox() {
		System.setProperty("webdriver.gecko.driver"
				,"C:\\Users\\iSHIELD\\eclipse-workspace\\Project\\gecko_driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	 
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mynewtab.co/?pId=BT170902&searchEngine=bing&iDate=2020-02-11%2011:02:58 ");
		driver.manage().window().maximize();
	}
	

}
