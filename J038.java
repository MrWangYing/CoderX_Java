import java.util.Scanner;

public class J038 {
	public static void jisuan(int n) {
		double res = 0;
		if (n % 2 == 0) {
			for (double i = 2; i <= n; i += 2) {
				res += 1 / i;
			}
		}else {
			for (double i = 1; i <= n; i += 2) {
				res += 1 / i;
			}
		}
		System.out.println(String.format("%.2f", res));
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		jisuan(n);
	}
}
