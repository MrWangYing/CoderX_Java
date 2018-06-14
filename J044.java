
public class J044 {
	public static int factorial(int n) {
		int i = 1;
		if (n == 1) {
			return 1;
		}else {
		return n * factorial(n-1);
		}
	}
	public static void main(String[] args) {
		int i = 1;
		double sum = 0;
		while(i <= 20) {
			sum += 1 / (double)factorial(i);
			i++;
		}
		System.out.println(String.format("%.2f", sum));
	}
}
