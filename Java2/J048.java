
public class J048 {
	public static void main(String[] args) {
		int a[][] = new int[3][3];
		a[0][0] = 21;
		a[0][1] = 20;
		a[0][2] = 12;
		a[1][0] = 15;
		a[1][1] = 32;
		a[1][2] = 24;
		a[2][0] = 23;
		a[2][1] = 14;
		a[2][2] = 34;
		
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += a[i][i];
		}
		System.out.println("对角线之和为:" + sum);
	}
}
