package testpack;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import merpack.Calculatorapp;
public class CalculatorTest {

	@Test
	public void test() {
		Calculatorapp c1 = new Calculatorapp();
		assertEquals (3, c1.add(1,2));
		assertEquals (-1,c1.subtract(1,2));
		assertEquals (2,c1.multiply(1,2));
		assertEquals (0, c1.divide(2,2));
	}

}
