import java.util.Arrays;
import java.util.Scanner;

public class J050 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b[] = {2,6,17,27,34,38,42};
		b = Arrays.copyOf(b, b.length + 1);
		b[b.length - 1] = a;
		Arrays.sort(b);
		for (int i : b) {
			System.out.print(i + " ");
		}
	}
}
