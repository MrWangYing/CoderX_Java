import java.util.Random;
import java.util.Scanner;

public class J014 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Random rand = new Random();
		for(int i = 0; i < n; i++) {
			System.out.println(rand.nextInt(9000000) + 1000000);
		}
	}
}
