class Books {
	String name;
	String author;
	String price;
	public Books() {
		name = "��Java�����ŵ���ͨ����2�棩��";
		System.out.println("������" + name);
		author = "���տƼ�";
		System.out.println("���ߣ�" + author);
		price = "59.8Ԫ";
		System.out.println("�۸�" + price);
	}
}
public class J060 {
	public static void main(String[] args) {
		System.out.print("ͼ����Ϣ�� ");
		Books myBooks = new Books();
	}
}
