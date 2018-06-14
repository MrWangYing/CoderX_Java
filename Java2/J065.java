class Vehicles {
	static String brand;
	static String color;
	public Vehicles(String brand, String color) {
		this.brand = brand;
		this.color = color;
	}
	public static void run() {
		System.out.println("我已经开动了");
	}
	public static void showInfo() {
		System.out.println("商标为：" + brand);
		System.out.println("颜色为：" + color);
	}
}
class Car extends Vehicles{
	static int seats;
	public Car(String brand, String color,int seats) {
		super(brand, color);
		this.seats = seats;
	}
	public static void showCar() {
		System.out.println("商标为：" + brand);
		System.out.println("颜色为：" + color);
		System.out.println("座位数：" + seats);
	}
}
class Truck extends Vehicles{
	static double load;
	public Truck(String brand, String color,double load) {
		super(brand, color);
		this.load = load;
	}
	public static void showTruck() {
		System.out.println("商标为：" + brand);
		System.out.println("颜色为：" + color);
		System.out.println("载重为：" + load);
	}
}
public class J065 {
	public static void main(String[] args) {
		Vehicles vehicle = new Vehicles("车辆", "红色");
		vehicle.showInfo();
		Car car = new Car("小汽车", "红色", 4);
		car.showCar();
		Truck truck = new Truck("大卡车", "红色", 13.5);
		truck.showTruck();
	}
}
