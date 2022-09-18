package com.TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotation {
	@Test
    @BeforeSuite
	public void sunday() {
		
		System.out.println("1st day of the week");
	}
	
	@BeforeMethod
	public void monday() {
		
		System.out.println("2nd day of the week");
	}
	@Test
	@BeforeClass
	public void tuesday() {
		
		System.out.println("3rd day of the week");
	}
	@Test
	@BeforeSuite
	public void wednesday() {
		
		System.out.println("4th day of the week");
	}@Test
	public void thursday() {
		
		System.out.println("5th day of the week");
	}@Test
	@AfterMethod
	public void friday() {
		
		System.out.println("6th day of the week");
	}@Test
	@AfterMethod

	public void saturday() {
		
		System.out.println("7th day of the week");
	}
	
}
