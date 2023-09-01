package com.app.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {

	@Test
	public void test() {
		String str = "Junit is working fine";
		assertEquals("Junit is working fine", str);
	}
	
}
