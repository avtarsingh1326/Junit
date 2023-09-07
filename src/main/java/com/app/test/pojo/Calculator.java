package com.app.test.pojo;

public class Calculator {
	
	private double firstValue;
	private double secondValue;
	


	public Double add(double firstValue, double secondValue) {
		return firstValue + secondValue;
	}
	
	public Double multiply(double firstValue, double secondValue) {
		return firstValue * secondValue;
	}
	
	public Double divide(double firstValue, double secondValue) {
		return firstValue / secondValue;
	}
	
	public Double subtract(double firstValue, double secondValue) {
		return firstValue - secondValue;
	}
	
}
