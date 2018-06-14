class Multiplication {
	public static int mul(int i, int j) {
		int k = i * j;
		return k;
	}
	public static double mul(double a, double b, double c) {
		double d = a * b * c;
		return d;
	}
}
public class J066 {
	public static void main(String[] args) {
		Multiplication m = new Multiplication();
		int a = m.mul(10, 21);
		double b = m.mul(1.5, 2.4, 1.2);
		System.out.println(a);
		System.out.println(b);
	}
}
