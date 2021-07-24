import java.util.Scanner;

public class insertionsort {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        for(int i=1;i<n;i++){
            int  key=arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int print:arr){
            System.out.print(print+" ");
        }
        input.close();
    }
}
