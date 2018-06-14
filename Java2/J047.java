import java.util.*;

public class J047 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		String b = Long.toString(a);
		char [] c = b.toCharArray();
		for(char i : c) {
		}
		int j = c.length;
		System.out.print(c[j-4]);
		System.out.print(c[j-5]);
		System.out.print(c[j-6]);
		System.out.print(c[j-7]);
	}
}
