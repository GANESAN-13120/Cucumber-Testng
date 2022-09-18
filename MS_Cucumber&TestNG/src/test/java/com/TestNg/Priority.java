package com.TestNg;

import org.testng.annotations.Test;

public class Priority {
	
	@Test
	public void Sweet() {
		System.out.println("Halwa is very sweet");
	}
	@Test(priority=-12)
	public void Sour() {
		System.out.println("Lemon is very sour");
	}
	@Test(priority=10)

	public void Salty() {
		System.out.println("Salt is very salty");
	}
	@Test

	public void Spicy() {
		System.out.println("Chilly is very spicy");
	}
	@Test

	public void Astringent() {
		System.out.println("Halwa is very BananaFlower");
	}
	@Test(priority=2)
	public void Bitter() {
		System.out.println("Halwa is very Bittergourd");
	}

    


}
