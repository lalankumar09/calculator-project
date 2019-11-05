package com.viva.Calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AppTest 
{
	App app;
	@Before
	public void init() {
		app = new App();
	}
	
	@Test
	public void addTrue() {
		assertEquals(25, app.add(12, 13));
		System.out.println("addTrue Executed");
	}
	@Test
	public void addFail() {
		assertNotEquals(25, app.add(15, 13));
		System.out.println("addFail Executed");
	
	}
	
	@Test
	public void subTrue() {
		assertEquals(3, app.sub(16, 13));
		System.out.println("subTrue Executed");
	}
	@Test
	public void subFail() {
		assertNotEquals(2, app.sub(16, 13));
		System.out.println("subFail Executed");
	}
	
	@Test
	public void mulTrue() {
		assertEquals(25, app.mul(5, 5));
		System.out.println("mulTrue Executed");
	}
	@Test
	public void mulFail() {
		assertNotEquals(25, app.mul(5, 6));
		System.out.println("mulFail Executed");
	}
	
	
	@Test
	public void divTrue() {
		assertEquals(1, app.div(12, 12));
		System.out.println("divTrue Executed");
	}
	@Test
	public void divFail() {
		assertNotEquals(1, app.div(24, 12));
		System.out.println("divFail Executed");
	}
	@Test(expected = ArithmeticException.class)
        public void testDivideByZero() {
        int a = 15;
        int b = 0;
        app.div(a, b);
    }
  
}
