package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import complex_numbers.Complex;
import complex_numbers.StatusComplex;

class DivisionTests {

	@Test
	void test() {
		Complex n1 = new Complex(1, -1);  // n1 = 1 - i
		Complex n2 = new Complex(1, 1);   // n2 = 1 + i
		Complex n3 = new Complex(2, 0);   // n3 = 2
		Complex n4 = new Complex(-10, -5);// n4 = -10 - 5i
		Complex resultNumber;
		
		
		resultNumber = Complex.divide(n1, n1);
		assertEquals(new Complex(1, StatusComplex.ONLY_REAL).toString(), resultNumber.toString());
		
		resultNumber = Complex.divide(n1, n2);
		assertEquals(new Complex(-1, StatusComplex.ONLY_IMAG).toString(), resultNumber.toString());
		
		resultNumber = Complex.divide(n2, n3);
		assertEquals(new Complex(0.5, 0.5).toString(), resultNumber.toString());
		
		resultNumber = Complex.divide(n3, n4);
		assertEquals(new Complex(-0.16, 0.08).toString(), resultNumber.toString());
		
		resultNumber = Complex.divide(n2, n4);
		assertEquals(new Complex(-0.12, -0.04 ).toString(), resultNumber.toString());
	

	}

}
