class Employee {
	static long num;
	static String name;
	static int salary;
	static int grewth;
	public Employee(long num, String name, int salary, int grewth) {
		this.name = name;
		this.num = num;
		this.salary = salary;
		this.grewth = grewth;
		System.out.println("���" + num);
		System.out.println("����" + name);
		System.out.println("����нˮ" + salary);
		System.out.println("нˮ������" + grewth);
	}
	public static void sum() {
		int newSalary = salary + grewth;
		System.out.println("������Ĺ����ܶ�Ϊ��" + newSalary);
	}
}
public class J067 {
	public static void main(String[] args) {
		Employee employee = new Employee(1, "����", 8000, 1000);
		employee.sum();
	}
}
