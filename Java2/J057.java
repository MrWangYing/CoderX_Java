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
				System.out.println("�²�ɹ���");
				break;
			}
			if (v > Num.V) {
				System.out.println("�´��ˣ�");
			}
			if (v < Num.V) {
				System.out.println("��С�ˣ�");
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
