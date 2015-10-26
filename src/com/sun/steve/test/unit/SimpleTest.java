package com.sun.steve.test.unit;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import com.sun.steve.CustomAnnotationAndGenericsAndWildcards.SteveSunFirstCustomAnnotation;

public class SimpleTest {

	@Test
	public void testTimeUnit(){
		System.out.println("Entered testTimeUnit method!");
		assertEquals(120, TimeUnit.HOURS.toMinutes(2));
		System.out.println("Passed testTimeUnit method!");
	}
	
	@Test(expected = ArithmeticException.class)
	@SteveSunFirstCustomAnnotation(expected = ArithmeticException.class)
	public void testCustomAnnotation(){
		System.out.println("Entered testCustomAnnotation method!");
		int result = 3/0;
        System.out.println("This line should NOT be printed out even if it passed testCustomAnnotation test!");
	}
	
	@Test(expected = ArithmeticException.class)
	public void testException(){
		int result = 3/0;
	}
}
