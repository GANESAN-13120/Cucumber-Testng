package com.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login_Credential {
	
	public static WebDriver driver;


@Given("^User open the mystore page$")
public void user_open_the_mystore_page() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver"
			,"C:\\Users\\iSHIELD\\eclipse-workspace\\Project\\ChromeDriver104\\chromedriver_win32 (2).104\\chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

@When("^User Types Username$")
public void user_Types_Username() throws Throwable {
	
	driver.findElement(By.id("email")).sendKeys("sganesh13120@gmail.com");
}

@Then("^User Types Password$")
public void user_Types_Password() throws Throwable {
	
	driver.findElement(By.id("passwd")).sendKeys("SG@ganesh13120");
}

@Then("^User click the login button$")
public void user_click_the_login_button() throws Throwable {
	
	driver.findElement(By.id("SubmitLogin")).click();
}





}
