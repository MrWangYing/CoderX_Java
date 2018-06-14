class Books {
	String name;
	String author;
	String price;
	public Books() {
		name = "《Java从入门到精通（第2版）》";
		System.out.println("书名：" + name);
		author = "明日科技";
		System.out.println("作者：" + author);
		price = "59.8元";
		System.out.println("价格：" + price);
	}
}
public class J060 {
	public static void main(String[] args) {
		System.out.print("图书信息： ");
		Books myBooks = new Books();
	}
}
