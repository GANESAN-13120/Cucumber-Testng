package com.TestNg;

import org.testng.annotations.Test;

public class Invocation_Count {
	@Test(invocationCount=3)
	private void Tester() {
		System.out.println("Test the software");
	}
	@Test
	private void Developer() {
		System.out.println("Develope the software");
	}
	@Test
	private void Architect() {
		System.out.println("Designed the software");
	}
	@Test(invocationCount=2)
	private void Team_Leader() {
		System.out.println("Manage  the Team");
	}
	@Test
	private void User() {
		System.out.println("Use the software");
	}
	

}
