class Vehicles {
	static String brand;
	static String color;
	public Vehicles(String brand, String color) {
		this.brand = brand;
		this.color = color;
	}
	public static void run() {
		System.out.println("���Ѿ�������");
	}
	public static void showInfo() {
		System.out.println("�̱�Ϊ��" + brand);
		System.out.println("��ɫΪ��" + color);
	}
}
class Car extends Vehicles{
	static int seats;
	public Car(String brand, String color,int seats) {
		super(brand, color);
		this.seats = seats;
	}
	public static void showCar() {
		System.out.println("�̱�Ϊ��" + brand);
		System.out.println("��ɫΪ��" + color);
		System.out.println("��λ����" + seats);
	}
}
class Truck extends Vehicles{
	static double load;
	public Truck(String brand, String color,double load) {
		super(brand, color);
		this.load = load;
	}
	public static void showTruck() {
		System.out.println("�̱�Ϊ��" + brand);
		System.out.println("��ɫΪ��" + color);
		System.out.println("����Ϊ��" + load);
	}
}
public class J065 {
	public static void main(String[] args) {
		Vehicles vehicle = new Vehicles("����", "��ɫ");
		vehicle.showInfo();
		Car car = new Car("С����", "��ɫ", 4);
		car.showCar();
		Truck truck = new Truck("�󿨳�", "��ɫ", 13.5);
		truck.showTruck();
	}
}
