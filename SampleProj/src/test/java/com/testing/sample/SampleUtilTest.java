package com.testing.sample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleUtilTest {

	
	@Test
	public void testAdd()
	{
		System.out.println("SampleUtilTest.testAdd()");
		Integer a=100,b=200;
		Integer expResult=300;
		Integer result=SampleUtil.add(a, b);
		
		assertEquals(expResult, result);
		assertEquals(null, SampleUtil.add(15, null));
		assertEquals(null, SampleUtil.add(null, 20));
		assertEquals(null, SampleUtil.add(null, null));
	}
	
	@Test
	public void testAdd1() {
		assertEquals(null, SampleUtil.add(15, null));
	}
	
	@Test
	public void testAdd2() {
		assertEquals(null, SampleUtil.add(null, 15));
	}
	
	@Test
	public void testAdd3() {
		assertEquals(null, SampleUtil.add(null, null));
	}
	
}
