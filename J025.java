import java.util.Scanner;

public class J025 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int a = r / 10000;
		int b = r % 10000 / 1000;
		int c = r % 1000 / 100;
		int d = r % 100 / 10;
		int e = r % 10;
		if (a != 0) {
			System.out.printf("%d%d%d%d%d",e,d,c,b,a);
		}
		else if (d != 0) {
			System.out.printf("%d%d%d%d",e,d,c,b);
		}
		else if (c != 0) {
			System.out.printf("%d%d%d",e,d,c);
		}
		else if (b != 0) {
			System.out.printf("%d%d",e,d);
		}
		else {
			System.out.println(e);
		}
	}
}
