import java.util.Scanner;
public class nice {
    public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[]=new int[3];
		for(int i=0;i<arr.length;i++){
			arr[i]=input.nextInt();
		}
		int l=0,r=0;
		if(l<=r){
			l=arr[0];
			r=arr[1];
			int k=arr[2];
			l=(l-1)/k;
			r=r/k;
			int s=0;
			s=r-l;
			System.out.println(s);
		}
	}   
}