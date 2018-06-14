
public class J043 {
	public static int factorial(int n) {
		int i = 1;
		if (n == 1) {
			return 1;
		}else {
		return n * factorial(n-1);
		}
	}
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
}
