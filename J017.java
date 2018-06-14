
public class J017 {
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			int x, y, z = 0;
			x = i / 100;
			y = (i - x * 100) / 10;
			z = i - x * 100 - y * 10;
			if (i == x * x * x + y * y * y + z * z * z) {
				System.out.println("Ë®ÏÉ»¨Êý£º" + i);
			}
		}
	}
}
