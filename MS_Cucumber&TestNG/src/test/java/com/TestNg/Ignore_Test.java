package com.TestNg;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Test {
	    @Test
		public void Name() {
			System.out.println("S.GANESAN");
		}
		@Test
		public void Rollno() {
			System.out.println("123456");
		}
		@Test
		public void Class() {
			System.out.println("M.sc");
		}
		@Test@Ignore
		public void Subject() {
			System.out.println("Physics");
		}
		@Test(enabled=false)
		public void Tamil() {
			System.out.println("100");
		}
		@Test
		public void English() {
			System.out.println("200");
		}
	}



