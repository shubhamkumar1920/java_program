import java.util.*;
public class selectionsort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=input.nextInt();
        }
        int indexofmin;
        for(int i=0;i<n-1;i++){
            indexofmin=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[indexofmin]){
                    indexofmin=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[indexofmin];
            arr[indexofmin]=temp;
        }
        for(int print:arr){
            System.out.print(print+" ");
        }
        input.close();//closing the scanner in program i am using because it give a warning

    }
}
