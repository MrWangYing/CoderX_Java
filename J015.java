import java.util.Scanner;

public class J015 {
	public static double bmi(double i, double j) {
		double res = i / (j * j);
		return res;
	}
	public static void jugle(double i) {
		if (i < 18.5) {
			System.out.println("过轻");
		}
		else if (i < 23.9) {
			System.out.println("正常");
		}
		else if (i < 27) {
			System.out.println("过重");
		}
		else if (i < 32) {
			System.out.println("肥胖");
		}
		else {
			System.out.println("非常肥胖");
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double i = scan.nextDouble();
		double j = scan.nextDouble();
		jugle(bmi(i, j));
	}
}
