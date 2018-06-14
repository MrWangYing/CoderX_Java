
public class J075 {
	static int j = 0;
	private static void move(char o, char d, int i) {
		System.out.println("从 " + o + " 移动盘子 " + i + " 号到 " + d);
	}
	public static void hannuo(int n, char a, char b, char c) {
		if (n == 1) {
			move(a, c, n);
		}else {
			hannuo(n - 1, a, c, b);
			move(a, c, n);
			hannuo(n - 1, b, a, c);
		}
		j += 1;
	}
	public static void main(String[] args) {
		hannuo(3, 'A', 'B', 'C');
		System.out.println(j);
	}
}
