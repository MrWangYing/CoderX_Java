import java.util.Scanner;

public class J045 {
	public static void change(int arr[], int m) {
		int n = arr.length;
		for(int i = n - m; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < n - m; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		change(array, m);
	}
}
