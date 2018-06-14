import java.util.Scanner;

public class J053 {
	public static void main(String[] args) {
		int a[] = {-6, 5, 10, 30, -9, 25, 6, 9, 18};
		int size = a.length;
		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				int min = a[i];
				if (a[j] < min) {
					min = a[j];
					a[j] = a[i];
					a[i] = min;
				}
			}
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}
