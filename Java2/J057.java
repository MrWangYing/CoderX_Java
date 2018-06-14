import java.util.Scanner;

class Num {
	public static final int V = 100;
}
class Guess{
	public static void guess() {
		while(true) {
			Scanner scan = new Scanner(System.in);
			int v = scan.nextInt();
			if (v == Num.V) {
				System.out.println("猜测成功！");
				break;
			}
			if (v > Num.V) {
				System.out.println("猜大了！");
			}
			if (v < Num.V) {
				System.out.println("猜小了！");
			}
		}
	}
}
public class J057 {
	public static void main(String[] args) {
		Guess g = new Guess();
		g.guess();
	}
}
