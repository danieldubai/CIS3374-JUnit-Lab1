package com.lab1.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.junit.Test;

public class CalculatorTest {
	
	private Calculator calculator;
	
	@Before
	public void setUp(){
		calculator = new Calculator();
	}
	
	@Test
	public void addtest() {
		assertEquals(4, calculator.add(2, 2));
	}
	
	@Test
	public void subtracttest() {
		assertEquals(0, calculator.subtract(2, 2));
	}
	
	@Test
	public void multiplytest() {
		assertEquals(8, calculator.multiply(2, 4));
	}
	
	@Test
	public void dividetest() {
		assertEquals(3, calculator.divide(6, 2));
	}
	
	@Test
	public void isEquals() {
		assertTrue(calculator.isEqual(2, 2));
		assertFalse(calculator.isEqual(2, 3));
	}

}
