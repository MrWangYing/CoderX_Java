import java.util.Scanner;

class Translate {
	public Translate(double c) {
		double f = 1.8 * c + 32;
		System.out.println("华氏度：" + f);
	}
}
public class J068 {
	public static void main(String[] args) {
		System.out.println("请输入摄氏度：");
		Scanner scanner = new Scanner(System.in);
		double c = scanner.nextDouble();
		Translate translate = new Translate(c);
	}
}
