package com.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Google {

	WebDriver driver;

@Given("^User is in Google Home Page$")
public void user_is_in_Google_Home_Page() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\iSHIELD\\eclipse-workspace\\Project\\ChromeDriver104\\chromedriver_win32 (2).104\\chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.get("https://www.google.com/webhp");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

	
}

@When("^Types in search bar for Iphone$")
public void types_in_search_bar_for_Iphone() throws Throwable {
	
	driver.findElement(By.name("q")).sendKeys("Cucumber testing");
}

@Then("^User click google search$")
public void user_click_google_search() throws Throwable {
	driver.findElement(By.name("btnK")).click();
}


}
