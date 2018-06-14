import java.util.Scanner;

public class J073 {
	public static void main(String[] args) {
		int myInt[] = {-6, 5, 10, 30, -9, 25, 6, 9, 18};
		for(int j = 1; j < myInt.length; j++) {
			for(int k = j; k > 0 && myInt[k] < myInt[k - 1]; k--) {
					int temp = myInt[k];
					myInt[k] = myInt[k - 1];
					myInt[k - 1] = temp;
			}
		}
		for (int i : myInt) {
			System.out.print(i + " ");
		}
	}
}
