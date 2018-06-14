import java.util.Arrays;

public class J049 {
	public static void main(String[] args) {
		int a[] = {1,23,43,12,32,34,42,65,64,40};
		Arrays.sort(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}
