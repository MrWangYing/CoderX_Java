import java.util.Arrays;

public class J074 {
	public static void quickSort(int arr[], int start, int end) {
		int i,j,k;
		if (start > end) {
			return;
		}
		i = start;
		j = end;
		k = arr[i];
		while (i < j) {
			while (i < j && arr[j] >= k)
				j--;
			if (i < j)
				arr[i++] = arr[j];
		while (i < j && arr[i] < k)
				i++;
			if (i < j)
				arr[j--] = arr[i];
		}
		arr[i] = k;
		quickSort(arr, start, i - 1);
		quickSort(arr, i + 1, end);
	}
	public static void quickSort2(int a[]) {
		quickSort(a, 0, a.length - 1);
	}
	public static void main(String[] args) {
		int a[] = {-6, 5, 10, 30, -9, 25, 6, 9, 18};
		quickSort2(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}
