import java.util.Scanner;

class Address {
	static String country;
	static String province;
	static String city;
	static String street;
	static String youbian;
	public Address() {
		Scanner scan = new Scanner(System.in);
		System.out.println("��������ң�");
		country = scan.nextLine();
		System.out.println("������ʡ�ݣ�");
		province = scan.nextLine();
		System.out.println("��������У�");
		city = scan.nextLine();
		System.out.println("������ֵ���");
		street = scan.nextLine();
		System.out.println("�������ʱࣺ");
		youbian = scan.nextLine();
	}
	public static void print() {
		System.out.println(country + " " +  province + " " + city + " " + street + " " + youbian);
	}
}
public class J059 {
	public static void main(String[] args) {
		Address myAddress = new Address();
		myAddress.print();
	}
}
