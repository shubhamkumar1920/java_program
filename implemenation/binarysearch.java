import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class binarysearch {
	public static int count(int arr[], int low, int high) {
		if (high >= low) {
			int mid = low + (high - low) / 2;
			if ((mid == high || arr[mid + 1] == 0) && (arr[mid] == 1))
				return mid + 1;
			if (arr[mid] == 1)
				return count(arr, (mid + 1), high);
			return count(arr, low, (mid - 1));
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		while (n-- > 0) {
			int size = input.nextInt();
			int arr[] = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = input.nextInt();
			}
			System.out.println(count(arr, 0, size - 1));
		}
	}
}
