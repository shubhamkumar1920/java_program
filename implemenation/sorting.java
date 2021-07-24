import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<n-1;i++){
            boolean sorted=true;
            for(int j=0;j<n-1-i;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    sorted=false;
                }
            }
            if(sorted){
                break;
            }
        }
        for(int item:arr){
            System.out.print(item + " ");
        }
        input.close();
    }
}
