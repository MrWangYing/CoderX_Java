
public class J029 {
	public static void main(String[] args) {
		for (int i = 10; i < 100; i++) {
			if (8 * i < 100 && 9 * i >= 100 && 809 * i == 800 * i + 9 * i) {
				System.out.println("??�������λ��Ϊ��" + i);
				System.out.println("809*??��Ľ��Ϊ��" + (809 * i));
			}
		}
	}
}
