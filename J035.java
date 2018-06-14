import java.util.Scanner;

public class J035 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		char rank = (score >= 90) ? 'A' : ((score >= 60) ? 'B' : 'C');
		System.out.println("µÈ¼¶Îª:" + rank);
	}
}
