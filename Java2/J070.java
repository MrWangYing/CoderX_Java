class Dog {
	static String name, color;
	static int age;
	public Dog() {
		name = "Tony";
		color = "red";
		age = 5;
	}
	public void print() {
		System.out.println("小狗的名字是" + name);
		System.out.println("小狗的颜色是" + color);
		System.out.println("小狗的年龄是" + age);
	}
}
public class J070 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.print();
	}
}
