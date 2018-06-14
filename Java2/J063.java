class Vehicle {
	String name;
	static int speed;
	int size;
	public Vehicle(int size) {
		this.size = size;
		System.out.println("汽车的体积是：" + size);
	}
	public void move() {
		System.out.println("汽车正在移动");
	}
	public static void setSpeed(int spe) {
		speed = spe;
		System.out.println("汽车的速度是" + speed);
	}
	public void speedUp() {
		System.out.println("汽车正在加速");
	}
	public void speedDown() {
		System.out.println("汽车正在减速");
	}
}
public class J063 {
	public static void main(String[] args) {
		Vehicle myVehicle = new Vehicle(20);
		myVehicle.move();
		myVehicle.setSpeed(60);
		myVehicle.speedUp();
		myVehicle.speedDown();
		
	}
	
}