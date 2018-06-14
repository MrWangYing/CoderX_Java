
public class J037 {
	public static void main(String[] args) {
		int size = 20;
		double [] myDouble = new double[size];
		double j = 2;
		double k = 1;
		double l = 0;
		for (int i = 0; i < 20; i++) {
			myDouble[i] = j / k;
			l = j;
			j = j + k;
			k = l;
		}
		double total = 0;
		for (double i : myDouble) {
			total += i;
		}
		System.out.println("前二十项之和是：" + String.format("%.2f", total));
	}
}
