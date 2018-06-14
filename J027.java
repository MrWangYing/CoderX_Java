
public class J027 {
	public static void main(String[] args) {
		for (int i = 2; i < 100; i ++) {
			int k = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					k += 1;
				}
			}
			if (k <= 2) {
				System.out.println("ËØÊý£º" + i);
			}
		}
	}
}
