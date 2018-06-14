
class Person {
	private static String name;
	private static int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public static void display() {
		System.out.println("姓名:" + name + " 年龄:" + age);
	}
}
public class J061 {
	public static void main(String[] args) {
		Person myPerson = new Person("张三", 23);
		myPerson.display();
	}
}
