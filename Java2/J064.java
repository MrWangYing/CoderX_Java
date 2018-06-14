
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
		theMa = "酸辣";
		quantity = 2;
		likeSoup = true;
	}
	public static void check() {
		System.out.println("面码:" + theMa);
		System.out.println("分量:" + quantity + "两");
		if (likeSoup == true) {
			System.out.println("带汤");
		}else {
			System.out.println("不带汤");
		}
	}
}
public class J064 {
	public static void main(String[] args) {
		WuMingFen f1 = new WuMingFen("牛肉", 2, true);
		WuMingFen f2 = new WuMingFen("牛肉",2);
		WuMingFen f3 = new WuMingFen();
		f1.check();
		f2.check();
		f3.check();
	}
}
