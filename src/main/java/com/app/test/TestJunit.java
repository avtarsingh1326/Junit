package com.app.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.app.test.pojo.Calculator;
import com.app.test.pojo.MessageUtil;

public class TestJunit {

	String message = "Hello World";
	MessageUtil messageUtil = new MessageUtil(message);
	Calculator calculator = new Calculator();
	Double total = 0.0;
	
	
	@Test
	public void test() {
		String str = "Junit is working fine";
		assertEquals("Junit is working fine", str);
	}
	
	@Test
	public void testPrintMessage() {
		assertEquals(message, messageUtil.printMessage());
	}
	
	@Test
	public void testCalculationAdd() {
		total = 4.0;
		assertEquals(total, calculator.add(2, 2));
	}
	
	@Test
	public void testCalculationSub() {
		total = 3.0;
		assertEquals(total, calculator.subtract(5, 2));
	}
	
	@Test
	public void testCalculationMultiply() {
		total = 4.0;
		assertEquals(total, calculator.multiply(2, 2));
	}
	
	
	@Test
	public void testCalculationDivide() {
		total = 1.0;
		assertEquals(total, calculator.divide(2, 2));
	}
	
	
}
