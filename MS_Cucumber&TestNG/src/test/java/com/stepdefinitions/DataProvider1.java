package com.stepdefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataProvider1 {
	
	public static WebDriver driver;

	

@Given("^User open login page$")
public void user_open_login_page() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver"
			,"C:\\Users\\iSHIELD\\eclipse-workspace\\Project\\ChromeDriver104\\chromedriver_win32 (2).104\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	//String url = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	//driver.get(url);
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}

@When("^User Types user name and password$")
public void user_Types_user_name_and_password(DataTable arg1) throws Throwable {
	List<List<String>> asLists = arg1.asLists();
	driver.findElement(By.id("email")).sendKeys(asLists.get(0).get(0));
	driver.findElement(By.id("passwd")).sendKeys(asLists.get(0).get(1));
	
	
}

@Then("^User click login button$")
public void user_click_login_button() throws Throwable {
	driver.findElement(By.id("SubmitLogin")).click();
}



}
