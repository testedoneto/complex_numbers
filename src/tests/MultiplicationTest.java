package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import complex_numbers.Complex;
import complex_numbers.StatusComplex;

class MultiplicationTest {

	@Test
	void verify_multiplication_beetwen_two_complex() {
		Complex n1 = new Complex(1, -1);  // n1 = 1 - i
		Complex n2 = new Complex(1, 1);   // n2 = 1 + i
		Complex n3 = new Complex(2, 0);   // n3 = 2
		Complex n4 = new Complex(-10, -5);// n5 = -10 - 5i
		Complex resultNumber;
		
		
		resultNumber = Complex.multiply(n1, n1);
		assertEquals(new Complex(-2, StatusComplex.ONLY_IMAG).toString(), resultNumber.toString());
		
		resultNumber = Complex.multiply(n1, n2);
		assertEquals(new Complex(2, StatusComplex.ONLY_REAL).toString(), resultNumber.toString());
		
		resultNumber = Complex.multiply(n2, n3);
		assertEquals(new Complex(2, 2).toString(), resultNumber.toString());
		
		resultNumber = Complex.multiply(n3, n4);
		assertEquals(new Complex(-20, -10).toString(), resultNumber.toString());
		
		resultNumber = Complex.multiply(n2, n4);
		assertEquals(new Complex(-5, -15).toString(), resultNumber.toString());
	}

}
