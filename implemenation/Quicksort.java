import java.util.Scanner;

public class Quicksort {
    public static void quicksort(int[] a, int low, int high) {
        if (low < high) {
            int Partitionindex = partition(a, low, high);
            quicksort(a, low, Partitionindex-1);// sort left array
            quicksort(a, Partitionindex + 1, high);// sort right array
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;
        do{
            while(i<=high && arr[i] <= pivot) {
                i++;
            }
            while (j>=0 && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }while (i < j);

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        quicksort(arr,0,n-1);
        for (int print : arr) {
            System.out.print(print + " ");
        }
    }
}