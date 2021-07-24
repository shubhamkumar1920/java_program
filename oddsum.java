import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.util.Scanner;

public class oddsum {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int odd=0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
            if(arr[i]%2!=0){
                odd=odd+arr[i];
            }
        }
        System.out.println(odd);
    }
}
