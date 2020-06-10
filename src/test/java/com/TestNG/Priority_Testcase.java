package com.TestNG;

import org.testng.annotations.Test;

public class Priority_Testcase {
	@Test (priority=2)
	public void testcase1() {
		
		System.out.println("testcase1");
	}
	
	@Test (priority=3)
	public void testcase2() {
		
		System.out.println("testcase2");
	}
	
	@Test (priority=1)
	public void testcase3() {
		
		System.out.println("testcase3");
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
