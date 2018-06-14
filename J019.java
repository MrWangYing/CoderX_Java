
public class J019 {
	public static void yinzi(int n) {
		int sum = 1;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				sum = sum + (i + n / i);
			}
		}
		if (sum == n) {
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		for (int i = 2; i < 1000; i++) {
			yinzi(i);
		}
	}
}
