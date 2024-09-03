class Complex {
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public Complex add(int real, Complex complex) {
        return new Complex(this.real + real + complex.getReal(), this.imaginary + complex.getImaginary());
    }

    public Complex add(Complex complex1, Complex complex2) {
        return new Complex(complex1.getReal() + complex2.getReal(), complex1.getImaginary() + complex2.getImaginary());
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}

public class ComplexNumberAddition {
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(4i, 5);

        // Method overloading: adding an integer to a complex number
        Complex result1 = c1.add(10i, c2);
        System.out.println("Result 1: " + result1);

        // Method overloading: adding two complex numbers
        Complex result2 = c1.add(c2, c1);
        System.out.println("Result 2: " + result2);
    }
}