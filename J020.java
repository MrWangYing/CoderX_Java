
public class J020 {
	public static void main(String[] args) {
		int [] myInt = {1, 2, 3, 4};
		int count = 0;
		for (int i : myInt) {
			for (int j : myInt) {
				for (int k : myInt) {
					if (i != j && i != k && j != k) {
						System.out.print((i * 100 + j * 10 + k) + " ");
						count += 1;
						if (count % 5 == 0) {
							System.out.print("\n");
						}
					}
				}
			}
		}
		System.out.print("\n共有" + count + "种情况");
	}
}
