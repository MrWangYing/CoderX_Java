
class Employ {
	static String name;
	static int age;
	static String sex;
	static int salary;
	public Employ(String name, int age, String sex, int salary) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.salary = salary;
	}
	public static void print() {
		System.out.println("������" + name + "���䣺" + age + "�Ա�" + sex + "нˮ" + salary);
	}
}
public class J062 {
	public static void main(String[] args) {
		Employ emp1 = new Employ("�ڷ�ħŮ", 21, "Ů", 6000);
		Employ emp2 = new Employ("�׷�ħŮ", 21, "Ů", 7500);
		emp1.print();
		emp2.print();
	}
}
