
class WuMingFen {
	static String theMa;
	static int quantity;
	static boolean likeSoup;
	public WuMingFen(String theMa, int quantity, boolean likeSoup) {
		this.theMa = theMa;
		this.quantity = quantity;
		this.likeSoup = likeSoup;
	}
	public WuMingFen(String theMa, int quantity) {
		this.theMa = theMa;
		this.quantity = quantity;
		likeSoup = true;
	}
	public WuMingFen() {
		theMa = "����";
		quantity = 2;
		likeSoup = true;
	}
	public static void check() {
		System.out.println("����:" + theMa);
		System.out.println("����:" + quantity + "��");
		if (likeSoup == true) {
			System.out.println("����");
		}else {
			System.out.println("������");
		}
	}
}
public class J064 {
	public static void main(String[] args) {
		WuMingFen f1 = new WuMingFen("ţ��", 2, true);
		WuMingFen f2 = new WuMingFen("ţ��",2);
		WuMingFen f3 = new WuMingFen();
		f1.check();
		f2.check();
		f3.check();
	}
}
