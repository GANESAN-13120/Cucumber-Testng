package com.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Multiple_Scenario {
	
	public static WebDriver driver;
	

@Given("^User enter the Google page$")
public void user_enter_the_Google_page() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver"
			,"C:\\Users\\iSHIELD\\eclipse-workspace\\Project\\ChromeDriver104\\chromedriver_win32 (2).104\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.google.co.in/webhp");
}

@When("^User find the google icon above the search bar$")
public void user_find_the_google_icon_above_the_search_bar() throws Throwable {
	driver.findElement(By.name("q")).sendKeys("Information Technology");
}

@Then("^User able to see Multiple colour of Google$")
public void user_able_to_see_Multiple_colour_of_Google() throws Throwable {
	driver.findElement(By.name("btnK")).click();
	driver.close();
	
}
public static WebDriver driver1;

@Given("^User enter the Yahoo page$")
public void user_enter_the_Yahoo_page() throws Throwable {

	System.setProperty("webdriver.chrome.driver"
			,"C:\\Users\\iSHIELD\\eclipse-workspace\\Project\\ChromeDriver104\\chromedriver_win32 (2).104\\chromedriver.exe");
	driver1=new ChromeDriver();
	driver1.get("https://www.startpage.com/");
}


@When("^User find the Yahoo icon above the search bar$")
public void user_find_the_Yahoo_icon_above_the_search_bar() throws Throwable {
	driver1.findElement(By.name("query")).sendKeys("Cucumber testing");
	}

@Then("^User able to see Mutiple colour of Yahoo$")
public void user_able_to_see_Mutiple_colour_of_Yahoo() throws Throwable {
	
	driver1.findElement(By.xpath("//*[@id=\"search\"]/button[2]")).click();
	driver1.close();

	
}
	
public static WebDriver driver2;
@Given("^User enter the Bing icon$")
public void user_enter_the_Bing_icon() throws Throwable {

	System.setProperty("webdriver.chrome.driver"
			
,"C:\\Users\\iSHIELD\\eclipse-workspace\\Project\\ChromeDriver104\\chromedriver_win32 (2).104\\chromedriver.exe");
	driver2=new ChromeDriver();
	driver2.get("https://www.bing.com/?cc=in");
}

@When("^User find the Bing icon above the search bar$")
public void user_find_the_Bing_icon_above_the_search_bar() throws Throwable {
	driver2.findElement(By.name("q")).sendKeys("selenium Automation");
}

@Then("^User able to see multiple colour of Bing$")
public void user_able_to_see_multiple_colour_of_Bing() throws Throwable {
	driver2.findElement(By.id("search_icon")).click();
	driver2.close();
	
}



}
