package complex_numbers;

public class Complex {
	private double realPart;
	private double imaginaryPart;
	private double degreeArgument;
	private double module;

	public Complex(double real, double imaginary) {
		this.realPart = real;
		this.imaginaryPart = imaginary;
	}

	public Complex(double real) {
		this.realPart = real;
		this.imaginaryPart = 0;
	}

	public Complex(double imaginary, char isImaginary) {
		this.imaginaryPart = imaginary;
		this.realPart = 0;
	}

	public void add(double real, double imaginary) {
		this.realPart += real;
		this.imaginaryPart += imaginary;
	}

	public void add(Complex number) {
		double a = number.getRealPart();
		double b = number.getImaginaryPart();

		this.realPart += a;
		this.imaginaryPart += b;
	}

	public void subtract(double real, double imaginary) {
		this.realPart -= real;
		this.imaginaryPart -= imaginary;
	}

	public void multiply(double real, double imaginary) {
		double newRealPart;
		double newImaginaryPart;

		newRealPart = this.realPart * real - this.imaginaryPart * imaginary;
		newImaginaryPart = this.realPart * imaginary + this.imaginaryPart * real;

		this.realPart = newRealPart;
		this.imaginaryPart = newImaginaryPart;
	}

	public void multiply(Complex number) {
		// z = a + bi
		double a = number.getRealPart();
		double b = number.getImaginaryPart();

		this.multiply(a, b);
	}

	public void multiply(double real) {
		this.realPart *= real;
		this.imaginaryPart *= real;
	}

	public void multiplyImaginaryOnly(double imaginary) {
		// z = a + bi
		// ci = 2i
		// 2i(a+bi) = -2b + 2ai
		double newImaginary = this.realPart * imaginary;
		double newReal = this.imaginaryPart * imaginary * (-1);

		this.realPart = newReal;
		this.imaginaryPart = newImaginary;
	}

	public Complex getConjugate() {
		double realConjugatePart;
		double imaginaryConjugatePart;

		realConjugatePart = this.realPart;
		imaginaryConjugatePart = (-1) * this.imaginaryPart;

		return new Complex(realConjugatePart, imaginaryConjugatePart);
	}

	public void divideBy(double real, double imaginary) {
		Complex denominator = new Complex(real, imaginary);
		Complex denominatorConjugate = denominator.getConjugate();
		double denominatorReal;

		denominator.multiply(denominatorConjugate.getRealPart(), denominatorConjugate.getImaginaryPart());
		denominatorReal = denominator.getRealPart();
		this.multiply(denominatorConjugate);

		this.realPart = this.getRealPart() / denominatorReal;
		this.imaginaryPart = this.getImaginaryPart() / denominatorReal;
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
