class Person {
	static String name;
	static String address;
	static String phoneNum;
	public Person(String name, String adress, String phoneNum) {
		this.name = name;
		this.address = adress;
		this.phoneNum = phoneNum;
	}
	public void toS() {
		System.out.println("����:" + "Person");
		System.out.println("������" + name);
	}
}

class Student extends Person {
	String banji;
	public Student(String name, String adress, String phoneNum, String banji) {
		super(name, adress, phoneNum);
		this.banji = banji;
	}
	public void toS() {
		System.out.println("����:" + "Studeng");
		System.out.println("������" + name);
	}
}

class Employee extends Person {
	public Employee(String name, String adress, String phoneNum) {
		super(name, adress, phoneNum);
	}
}

class Faculty extends Employee {
	String jibie;
	public Faculty(String name, String adress, String phoneNum, String jibie) {
		super(name, adress, phoneNum);
		this.jibie = jibie;
	}
	public void toS() {
		System.out.println("����:" + "Faculty");
		System.out.println("������" + name);
	}
}
class Staff extends Employee {
	String zhiwu;
	public Staff(String name, String adress, String phoneNum, String zhiwu) {
		super(name, adress, phoneNum);
		this.zhiwu = zhiwu;
	}
	public void toS() {
		System.out.println("����:" + "Staff");
		System.out.println("������" + name);
	}
}
public class J069 {
	public static void main(String[] args) {
		Person person = new Person("Tony", "�㽭", "1234567");
		Student student  = new Student("Tony", "�㽭", "1234567", "2");
		Faculty faculty = new Faculty("Tony", "�㽭", "1234567", "4");
		Staff staff = new Staff("Tony", "�㽭", "1234567", "�߼�ְ��");
		person.toS();
		student.toS();
		faculty.toS();
		staff.toS();
	}
}
