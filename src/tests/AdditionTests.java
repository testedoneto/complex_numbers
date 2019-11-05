package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import complex_numbers.Complex;

class AdditionTests {

	@Test
	void verify_add_with_complex_parameter() {
		Complex n1 = new Complex(1, -1);  // n1 = 1 - i
		Complex n2 = new Complex(1, 1);   // n2 = 1 + i
		Complex n3 = new Complex(2, 0);   // n3 = 2
		Complex n4 = new Complex(-10, -5);// n5 = -10 - 5i
		Complex resultNumber;
		
		
		resultNumber = Complex.add(n1, n2);
		assertEquals(new Complex(2, false).toString(), resultNumber.toString());
		
		resultNumber = Complex.add(n2,n3);
		assertEquals(new Complex(3,1).toString(), resultNumber.toString());
		
		resultNumber = Complex.add(n3, n4);
		assertEquals(new Complex(-8,-5).toString(), resultNumber.toString());
		
		resultNumber = Complex.add(n4 , n4);
		assertEquals(new Complex(-20,-10).toString(), resultNumber.toString());
	}
	
	
}
