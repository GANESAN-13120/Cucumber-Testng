package com.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Multiple_Data_Provider {
	
	public static WebDriver driver;
	

@Given("^User going to online page$")
public void user_going_to_online_page() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\iSHIELD\\eclipse-workspace\\Project\\ChromeDriver104\\chromedriver_win32 (2).104\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	driver.manage().window().maximize();
}

@When("^User give input values \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_give_input_values_and(String username, String password) throws Throwable {
	
	driver.findElement(By.name("email")).sendKeys(username);
	driver.findElement(By.name("passwd")).sendKeys(password);
}

@Then("^User click on Login button and navigate to home page$")
public void user_click_on_Login_button_and_navigate_to_home_page() throws Throwable {
	
	driver.findElement(By.name("SubmitLogin")).click();
	driver.close();
}



}
