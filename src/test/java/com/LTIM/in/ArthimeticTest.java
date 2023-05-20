package com.LTIM.in;
import org.junit.*;

import static org.junit.Assert.*;

public class ArthimeticTest {

	@Test
	public void testPositiveNumbers()
	{
		System.out.println("Test add() with positive numbers");
		
		Arthimetic arth =new Arthimetic();
		int actual =arth.add(10,10);
		int expected =20;
		
		assertEquals(expected,actual);
		System.out.println("hello karthikeya!");
	}
	@Test
	public void testnegaiveNumbers()
	{
		System.out.println("Test add() with negative numbers");
		
		Arthimetic arth =new Arthimetic();
		int actual =arth.add(-10,-10);
		int expected =-20;
		
		assertEquals(expected,actual);
		System.out.println("hello karthikeya!");
	}
	
	@Test
	public void testMixedNumbers()
	{
		System.out.println("Test add() with Mixed numbers");
		
		Arthimetic arth =new Arthimetic();
		int actual =arth.add(-10,10);
		int expected =0;
		
		assertEquals(expected,actual);
		System.out.println("hello karthikeya!");
	}
	
	@Test
	public void testZeroNumbers()
	{
		System.out.println("Test add() with Zero numbers");
		
		Arthimetic arth =new Arthimetic();
		int actual =arth.add(0,0);
		int expected =0;
		
		assertEquals(expected,actual);
		System.out.println("hello karthikeya!");
	}
}

