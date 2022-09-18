package com.TestNg;

import org.testng.annotations.Test;

public class Dependency {
	@Test
	private void age18() {
		System.out.println("Age 18 is elligible for voting");
	}
	@Test(dependsOnMethods = "age18")
	private void age20() {
		System.out.println("Age 20 is elligible for Marriage");
	}
	@Test(dependsOnMethods = "age20")
	private void age25() {
		System.out.println("Age 25 is elligible for 2 Kids");
	}

}
