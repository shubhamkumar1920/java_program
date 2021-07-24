import java.util.Scanner;

public class Partiton {
    public static void partition(int[] arr, int pivot) {
        int i=0;
        int j=0;
        while(i < arr.length){
            if(arr[i]> pivot){
                i++;
            }else{
                swap(arr,i,j);
                i++;
                j++;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        partition(arr,arr[n-1]);
        for (int print : arr) {
            System.out.print(print + " ");
        }
    }
}
