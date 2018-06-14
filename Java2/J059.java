import java.util.Scanner;

class Address {
	static String country;
	static String province;
	static String city;
	static String street;
	static String youbian;
	public Address() {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入国家：");
		country = scan.nextLine();
		System.out.println("请输入省份：");
		province = scan.nextLine();
		System.out.println("请输入城市：");
		city = scan.nextLine();
		System.out.println("请输入街道：");
		street = scan.nextLine();
		System.out.println("请输入邮编：");
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
