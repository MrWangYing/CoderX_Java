
public class J052 {
	public static void main(String[] args) {
		int a[] = {2,3,1,5,6};
		int min = a[0];
		for (int i : a) {
			if (i <= min) {
				min = i;
			}
		}
		System.out.println(min);
	}
}
