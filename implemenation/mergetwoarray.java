import java.util.Scanner;

public class mergetwoarray {
    public static int[] Mergetwoarray(int[] a, int[] b, int[] arr, int m, int n) {
        int i=0;
        int j=0;
        int k=0;
        while(i < n && j < m){
            if(a[i] < b[j]){
                arr[k] = a[i];
                i++;
                k++;
            }else{
                arr[k] = b[j];
                j++;
                k++;
            }
        }
        while(i < n){
            arr[k] = a[i];
            k++;
            i++;
        }
        while(j < m){
            arr[k] = b[j];
            k++;
            j++;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        int m = input.nextInt();
        int[] b = new int[m];
        for(int i=0;i<m;i++){
            b[i]=input.nextInt();
        }
        int[] arr = new int[n+m];
        Mergetwoarray(a,b,arr,m,n);
        for(int print:arr){
            System.out.print(print+" ");
        }
    }
}
