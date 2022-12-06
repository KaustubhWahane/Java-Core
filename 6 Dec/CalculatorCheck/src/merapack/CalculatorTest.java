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
	
}
