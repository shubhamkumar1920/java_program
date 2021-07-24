import java.util.Scanner;

public class Mergesort1 {
    public static void mergesort(int[] arr,int low,int high){
        if(low < high){
            int mid = (low + high)/2;
            mergesort(arr, low, mid);
            mergesort(arr, mid+1, high);
            merge(arr,low,mid,high);
        }
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void merge(int[] arr,int low,int mid,int high){
        int i=low;
        int j=mid+1;
        int k=low;
        int[] b = new int[100];
        while(i <= mid && j <= high){
            if(arr[i] < arr[j]){
                b[k] = arr[i];
                i++;
                k++;
            }else{
                b[k] = arr[j];
                j++;
                k++;
            }
        }
        while(i <= mid){
            b[k] = arr[i];
            k++;
            i++;
        }
        while(j <= high){
            b[k] = arr[j];
            k++;
            j++;
        }
        for(int s=low;s<=high;s++){
            arr[s]= b[s];
        }      
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        mergesort(arr,0,n-1);
        print(arr);
    }
}