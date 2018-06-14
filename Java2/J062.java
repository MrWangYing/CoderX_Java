
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
		System.out.println("姓名：" + name + "年龄：" + age + "性别：" + sex + "薪水" + salary);
	}
}
public class J062 {
	public static void main(String[] args) {
		Employ emp1 = new Employ("黑发魔女", 21, "女", 6000);
		Employ emp2 = new Employ("白发魔女", 21, "女", 7500);
		emp1.print();
		emp2.print();
	}
}
