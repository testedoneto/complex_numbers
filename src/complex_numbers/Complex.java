package complex_numbers;

public class Complex {
	private double realPart;
	private double imaginaryPart;
	public static StatusComplex status;
	
	public Complex(double real, double imaginary) {
		this.realPart = real;
		this.imaginaryPart = imaginary;
	}

	public Complex(double value, StatusComplex status) {
		if(status == StatusComplex.ONLY_IMAG) {
			this.imaginaryPart = value;
			this.realPart = 0;
		}else {
			this.imaginaryPart = 0;
			this.realPart = value;
		}
		
	}
	
	public static Complex getConjugate(Complex number) {
		double realConjugatePart;
		double imaginaryConjugatePart;

		realConjugatePart = number.getRealPart();
		imaginaryConjugatePart = (-1) * number.getImaginaryPart();

		return new Complex(realConjugatePart, imaginaryConjugatePart);
	}
	
	public static Complex add(Complex number1, Complex number2) {
		
		double resultReal = number1.getRealPart() + number2.getRealPart();
		double resultImaginary= number1.getImaginaryPart() + number2.getImaginaryPart();
		
		return new Complex(resultReal,resultImaginary);
	}
	
	public static Complex multiply(Complex number1, Complex number2) {
		double realResult = number1.getRealPart() * number2.getRealPart() -
							number1.getImaginaryPart() * number2.getImaginaryPart();
		
		double imaginaryResult = number1.getRealPart()      * number2.getImaginaryPart() +
								 number1.getImaginaryPart() * number2.getRealPart();
		
		return new Complex(realResult, imaginaryResult);
	}
	
	public static Complex divide(Complex number1, Complex number2) {
		Complex conjugateN2 = Complex.getConjugate(number2);
		
		Complex numeretor = Complex.multiply(number1, conjugateN2);
		Complex denominator = Complex.multiply(number2, conjugateN2);
		
		double realResult      = numeretor.getRealPart()      / denominator.getRealPart();
		double imaginaryResult = numeretor.getImaginaryPart() / denominator.getRealPart();
		return new Complex(realResult,imaginaryResult);
	}

	public static boolean isEqual(Complex number1, Complex number2) {
		double re1 = number1.getRealPart();
		double im1 = number1.getImaginaryPart();
		
		double re2 = number2.getRealPart();
		double im2 = number2.getImaginaryPart();
		
		if(re1 == re2 && im1 == im2) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "("+this.realPart + ","+this.imaginaryPart + ")";
	}

	public double getRealPart() {
		return this.realPart;
	}

	public double getImaginaryPart() {
		return this.imaginaryPart;
	}

}
