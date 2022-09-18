package com.TestNg;

import org.testng.annotations.Test;

public class Expected_Exception {
	@Test(expectedExceptions = ArithmeticException.class)
	private void addition() {
		int a =12;
		System.out.println(a/0);
	}

}
