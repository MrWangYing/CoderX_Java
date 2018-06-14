import java.util.Arrays;

public class J051 {
	public static void main(String[] args) {
		int a[] = {30, 25, 18, 10, 9, 6, 5, -6, -9};
		Arrays.sort(a);
		for(int i : a) {
			System.out.print(i + " ");
		}
	}
}
