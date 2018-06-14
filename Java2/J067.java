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
		System.out.println("编号" + num);
		System.out.println("姓名" + name);
		System.out.println("基本薪水" + salary);
		System.out.println("薪水增长额" + grewth);
	}
	public static void sum() {
		int newSalary = salary + grewth;
		System.out.println("增长后的工资总额为：" + newSalary);
	}
}
public class J067 {
	public static void main(String[] args) {
		Employee employee = new Employee(1, "张三", 8000, 1000);
		employee.sum();
	}
}
