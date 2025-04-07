package com.trivium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {
       
	
	@Test
    void testAdd() {
		Calculator calculator=new Calculator();
		int result=calculator.add(2, 3);
		assertEquals(5, result);
	}
	@Test
	 void testSub() {
		Calculator calculator=new Calculator();
		int result=calculator.sub(5, 3);
		assertEquals(2, result);
	}
	@Test
	void testmul() {
		Calculator calculator=new Calculator();
		int result=calculator.mul(5, 3);
		assertEquals(15, result);
	}
	@Test
	void testdiv() {
		Calculator calculator=new Calculator();
		int result=calculator.div(4, 2);
		assertEquals(2, result);
	}
}
