import java.util.Scanner;

public class BinarySearch1 {
    public static int binarysearch(int[] arr, int size, int element) {
        int low = 0;
        int mid;
        int high = size - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == element) {
                return mid;
            }
            if (arr[mid] < element) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            // return -1;
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("input search element;");
        int k = input.nextInt();// k is present in array if u want to search;
        int ans = binarysearch(arr, n, k);
        if (ans == -1) {
            System.out.println("element is not in an array");
        } else {
            System.out.println(ans);
        }
    }
}
