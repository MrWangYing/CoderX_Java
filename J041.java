import java.util.Scanner;

public class J041 {
	public static void agio(double m) {
		System.out.println("�����ۼ����ѽ��Ϊ��" + m);
		int n = 0;
		if (m >= 200 && m < 400) {
			n = 1;
		}else if (m < 600) {
			n = 2;
		}else if (m < 800) {
			n = 3;
		}else if (m < 1000) {
			n = 4;
		}else if (m < 1200) {
			n = 5;
		}else if (m < 1400) {
			n = 6;
		}else if (m < 1600) {
			n = 7;
		}else if (m < 1800) {
			n = 8;
		}else if (m < 2000) {
			n = 9;
		}else if (m < 2200) {
			n = 10;
		}else {
			n = 11;
		}
		switch (n) {
		case 1:
			System.out.println("�������ܾ������Żݣ�");
			break;
		case 2:
			System.out.println("�������ܾ����Żݣ�");
			break;
		case 3:
			System.out.println("�������ܰ������Żݣ�");
			break;
		case 4:
			System.out.println("�������ܰ������Żݣ�");
			break;
		case 5:
			System.out.println("�������ܰ����Żݣ�");
			break;
		case 6:
			System.out.println("���������߰����Żݣ�");
			break;
		case 7:
			System.out.println("���������������Żݣ�");
			break;
		case 8:
			System.out.println("���������������Żݣ�");
			break;
		case 9:
			System.out.println("�������������Żݣ�");
			break;
		case 10:
			System.out.println("���������������Żݣ�");
			break;
		case 11:
			System.out.println("�������������Żݣ�");
			break;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double money = scan.nextDouble();
		agio(money);
	}
}
