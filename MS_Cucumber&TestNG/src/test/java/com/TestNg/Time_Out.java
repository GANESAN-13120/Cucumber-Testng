package com.TestNg;

import org.testng.annotations.Test;

public class Time_Out {
	@Test
	private void Java() {
		System.out.println("You are become the Tester");
	}
	@Test(timeOut=3000)
	private void Phython() throws InterruptedException {
	    System.out.println("Your are become the developer");
	    Thread.sleep(3000);
	}

}
