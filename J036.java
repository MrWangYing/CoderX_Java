import java.util.Scanner;

public class J036 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int mon = scan.nextInt();
		if (mon <= 3) {
			System.out.println("��������·����ڴ���");
		}
		else if (mon <= 6) {
			System.out.println("��������·������ļ�");
		}
		else if (mon <= 9) {
			System.out.println("��������·������＾");
		}else {
			System.out.println("��������·����ڶ���");
		}
	}
}
