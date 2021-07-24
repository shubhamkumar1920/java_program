import java.util.Scanner;

public class Quickosrt1 {
    public static void quicksort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int pivot = arr[high];
        int pi = partition(arr,pivot,low,high);
        quicksort(arr, low, pi-1);
        quicksort(arr, pi+1, high);
    }
    public static int partition(int[] arr,int pivot,int low,int high){
        int i=low,j=low;
        while(i<=high){
            if(arr[i] <= pivot){
                swap(arr,i,j);
                i++;
                j++;
            }else{
                i++;
            }
        }
        return j-1;
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
        quicksort(arr,0,n-1);
        for (int print : arr) {
            System.out.print(print + " ");
        }
    }
}
