
public class J072 {
	public static void main(String[] args) {
		int n = 5;
		int a[][] = new int[n][];
		for (int i = 0; i < n; i++) {
			a[i] = new int[i+1];
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				int k = 1;
				for (int x = 1; x <= j; x++) {
					k = k * (i - x + 1) / x;
				}
				a[i][j] = k;
			}
		}
		for (int b[] : a) {
			for (int num : b) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
