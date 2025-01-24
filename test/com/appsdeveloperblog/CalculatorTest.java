package com.appsdeveloperblog;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void integerDivision() {
		Calculator calculator = new Calculator();
		int result = calculator.integerDivision(4, 2);
		assertEquals(2, result);
	}

}
