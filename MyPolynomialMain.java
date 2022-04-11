package Assgn;
class MyPolynomial{
	double[] coeffs;
	public MyPolynomial(double... coeffs) { 
		this.coeffs = coeffs;                
	}
	public int getDegree() {
		return coeffs.length-1;
	}
	public String toString() {
		String s = "";
		int n = coeffs.length-1;
		int i = 0;
		while(n>0) {
			String a = String.valueOf(coeffs[i]);
			s += a+"X^"+n+"+";
			n--;
			i++;
		}
		s+=String.valueOf(coeffs[i]);
		return s;
	}
	public double evaluate(double x) {
		double res = 0;
		int n = coeffs.length-1;
		int i = 0;
		while(n>=0) {
			res += coeffs[i]*Math.pow(x, n);
			n--;
			i++;
		}
		return res;
	}
	public MyPolynomial add(MyPolynomial right) {
		int t = this.coeffs.length;
		int r = right.coeffs.length;
		if(t<r) {
			for(int i = 0; i < t; i++) {
				right.coeffs[i] += this.coeffs[i];
			}
			return right;
		}
		else {
			for(int i = 0; i < r; i++) {
				this.coeffs[i] += right.coeffs[i];
			}
			return this;
		}
	}
	public MyPolynomial multiply(MyPolynomial right) {
		int t = this.coeffs.length;
		int r = right.coeffs.length;
		if(t<r) {
			for(int i = 0; i < t; i++) {
				right.coeffs[i] *= this.coeffs[i];
			}
			return right;
		}
		else {
			for(int i = 0; i < r; i++) {
				this.coeffs[i] *= right.coeffs[i];
			}
			return this;
		}
	}
}

public class MyPolynomialMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
		System.out.println(p1);
		for(double d: p1.coeffs)
			System.out.println(d);
		System.out.println(p1.evaluate(2));
		MyPolynomial p2 = new MyPolynomial(3.3, 4.3, 5.3);
		System.out.println(p1.add(p2));
		System.out.println(p1.multiply(p2));
	}

}

