
import java.util.Scanner;

public class J021 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double i = scan.nextDouble();
		double bonus = 0;
		if (i <= 10) {
			bonus = i * 0.1;
		}
		else if (i <= 20) {
			bonus = (i - 10) * 0.075 + 10 * 0.1;
		}
		else if (i <= 40) {
			bonus = (i - 20) * 0.05 + 10 * 0.1 + 10 * 0.075;
		}
		else if (i <= 60) {
			bonus = (i - 40) * 0.03 + 10 * 0.1 + 10 * 0.075 + 20 * 0.05;
		}
		else if (i <= 100) {
			bonus = (i - 60) * 0.015 + 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + 20 * 0.03;
		}
		else {
			bonus = (i -100) * 0.01 + 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + 20 * 0.03 + 40 * 0.015;
		}
		System.out.println("应提取的奖金是：" + bonus + "万元");
	}
}