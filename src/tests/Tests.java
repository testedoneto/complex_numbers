package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import complex_numbers.Complex;

class Tests {

	@Test
	void verify_add_with_complex_parameter() {
		Complex n1 = new Complex(1, -1);  // n1 = 1 - i
		Complex n2 = new Complex(1, 1);   // n2 = 1 + i
		Complex n3 = new Complex(2, 0);   // n3 = 2
		Complex n4 = new Complex(-10, -5);// n5 = -10 - 5i
		String result;
		
		n1.add(n2);
		result = n1.toString();
		assertEquals(new Complex(2).toString(), result);
		
		n2.add(n3);
		result = n2.toString();
		assertEquals(new Complex(3,1).toString(), result);
		
		
		n3.add(n4);
		result = n3.toString();
		assertEquals(new Complex(-8,-5).toString(), result);
	}
	
	@Test
	void verify_add_coordinate() {
		Complex n1 = new Complex(1,-1);
		Complex n2 = new Complex(-10, -5);
		String result;
		
		n1.add(1,1);
		result = n1.toString();
		assertEquals(new Complex(2).toString(), result);
		
		n1.add(-3, 4);
		result = n1.toString();
		assertEquals(new Complex(-1,4).toString(), result);
		
		n2.add(10,5);
		result = n2.toString();
		assertEquals(new Complex(0).toString(), result);
	}

}
