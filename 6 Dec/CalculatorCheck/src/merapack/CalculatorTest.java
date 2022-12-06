package merapack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	public void calculatorTest() {
		Calculator c1 = new Calculator();
		int addition = c1.add(5,6);
		assertEquals (11, addition);
	}

	public void calculatorTest2() {
		Calculator c2 = new Calculator();
		int subtraction= c2.subtract(5,6);
		assertEquals (-1, subtraction);
	}
	public void calculatorTest3() {
		Calculator c1 = new Calculator();
		int multiplication = c1.multiply(5,6);
		assertEquals (30, multiplication);
	}
	public void calculatorTest4() {
		Calculator c1 = new Calculator();
		int division= c1.divide(5,6);
		assertEquals (1, division);
	}

	
}
