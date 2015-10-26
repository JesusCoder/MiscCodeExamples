package com.sun.steve.test.integ;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SimpleIntegTest {

	int a, b;
	
//	@BeforeMethod
	@BeforeClass
	public void setup(){
		a = 2;
		b = 3;
	}
	
	@Test(enabled = true)
	public void testSimpleAddition(){
		assertEquals(5, a+b);
	}
	
	@Test(dependsOnMethods = {"testSimpleAddition"})
	public void testSimpleDependency(){
		assertEquals(6, a*b, "It should be equal!");
	}
}
