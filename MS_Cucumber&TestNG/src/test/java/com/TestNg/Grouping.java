package com.TestNg;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups={"Dresses","Electronics"})
	private void Air_Conditioner() {
		System.out.println("Its conditioning the air");
	}
	@Test(groups="Electronics")
	private void Television() {
	   System.out.println("Watched movies");
	}
	@Test(groups="Dresses")
	private void TShirt() {
		System.out.println("TShirt colour is yellow");
	}
	@Test(groups="Electronics")
	private void Refridgerator() {
		System.out.println("Storing multiple Items");
	}
	@Test(groups="Dresses")
	private void Shirt() {
		System.out.println("Shirt colour is green");
		
	}
	@Test(groups="Electronics")
	private void Whasing_Machine() {
		System.out.println("Washing the cloths");
	}

}
