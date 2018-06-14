import java.util.Scanner;

public class J036 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int mon = scan.nextInt();
		if (mon <= 3) {
			System.out.println("您输入的月份属于春季");
		}
		else if (mon <= 6) {
			System.out.println("您输入的月份属于夏季");
		}
		else if (mon <= 9) {
			System.out.println("您输入的月份属于秋季");
		}else {
			System.out.println("您输入的月份属于冬季");
		}
	}
}
