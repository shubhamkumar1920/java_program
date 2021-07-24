import java.util.Scanner;

public class LinearSearch {
    public static int linearsearch(int[] arr,int size,int element){
        for(int i=0;i<size;i++){
            if(arr[i]==element){
                return i;
            }
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
        int k = input.nextInt();//k is present in array if u want to search;
        int ans=linearsearch(arr,n,k);
        System.out.println(ans);

    }
}
