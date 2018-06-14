
public class J016 {
	public static void main(String[] args) {
		for (int i = 101; i <= 200; i++) {
			int r = 0;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				r = i % j;
				if (i % j != 0) {
					continue;
				}else {
					break;
				}
			}
			if(r != 0) {
				System.out.println(i);
			}
		}
	}
}
