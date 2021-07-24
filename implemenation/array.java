import java.util.Scanner;
public class array {
    public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
        int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=input.nextInt();
		}
		for(int p : arr) {
			System.out.println(p);
		}		
	}
}