
class Person {
	private static String name;
	private static int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public static void display() {
		System.out.println("����:" + name + " ����:" + age);
	}
}
public class J061 {
	public static void main(String[] args) {
		Person myPerson = new Person("����", 23);
		myPerson.display();
	}
}
