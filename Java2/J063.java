class Vehicle {
	String name;
	static int speed;
	int size;
	public Vehicle(int size) {
		this.size = size;
		System.out.println("����������ǣ�" + size);
	}
	public void move() {
		System.out.println("���������ƶ�");
	}
	public static void setSpeed(int spe) {
		speed = spe;
		System.out.println("�������ٶ���" + speed);
	}
	public void speedUp() {
		System.out.println("�������ڼ���");
	}
	public void speedDown() {
		System.out.println("�������ڼ���");
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