package com.TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {
	@Test
	@Parameters("testparameters")
	private void test(String name) {
		System.out.println("Your name is" + name);
	}

}
