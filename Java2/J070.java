class Dog {
	static String name, color;
	static int age;
	public Dog() {
		name = "Tony";
		color = "red";
		age = 5;
	}
	public void print() {
		System.out.println("С����������" + name);
		System.out.println("С������ɫ��" + color);
		System.out.println("С����������" + age);
	}
}
public class J070 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.print();
	}
}
