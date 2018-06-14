import java.util.Scanner;

public class J034 {
	public static void y(double x) {
		double res = 0;
		if (x < 1) {
			res = x;
		}
		else if (x < 10) {
			res = 3 * x - 2;
		}
		else {
			res = 4 * x;
		}
		System.out.println("y=" + String.format("%.1f", res));
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		y(x);
	}
}
