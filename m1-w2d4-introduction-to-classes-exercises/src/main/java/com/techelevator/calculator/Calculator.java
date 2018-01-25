package com.techelevator.calculator;

public class Calculator {

	//
	// Write code here
	//
	
	//1. define instance variables
	private int currentValue = 0;

	//3.create methods

	public int add(int addend) {
		//currentValue = (currentValue + addend);
		//return currentValue;
		return currentValue += addend;		
	};
	public int multiply(int multiplier) {
		//currentValue = (currentValue * multiplier);
		//return currentValue;
		return currentValue*=multiplier;
	};
	public int subtract(int subtrahend) {
		//currentValue = (currentValue - subtrahend);
		//return currentValue;
		return currentValue-=subtrahend;
	};
	public int power(int exponent) {
		return currentValue = ((int) Math.pow(currentValue, exponent));
	};
	public void reset() {
		currentValue = 0;
	};
	
	
	//2. define getters and setters
	public int getCurrentValue() {
		return currentValue;
	}
	
	//int x = 0;
	//x = Math.pow(2,3);
	
}
