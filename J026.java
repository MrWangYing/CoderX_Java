import java.util.Scanner;

public class J026 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int a = i / 10000;
		int b = i % 10000 / 1000;
		int c = i % 100 / 10;
		int d = i % 10;
		if (a == d && b == c) {
			System.out.println("该数字是回文数字");
		}else {
			System.out.println("该数字不是回文数字");
		}
	}
}
