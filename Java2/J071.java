class Yinhang {
	static String name;
	static double money;
	public Yinhang(String name, double money) {
		this.name = name;
		this.money = money;
	}
	public void chaxun() {
		System.out.println("ÄúµÄÓà¶îÎª£º" + money);
	}
}
public class J071 {
	public static void main(String[] args) {
		Yinhang mYinhang = new Yinhang("6217856322222735", 15946.2);
		mYinhang.chaxun();
	}
}
