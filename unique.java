import java.util.Scanner;

public class unique {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int arr[] = new int[n];
        int res=arr[0];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
            res=res^arr[i];
        }
        System.out.println(res);         
    }
}
