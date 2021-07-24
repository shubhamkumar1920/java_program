import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
public class armstrong {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();

		// if(n<0)
		// 	System.out.print("not exist");
		// else{
		// 	for(int i=1;i<=n;i++){
				int temp=n;
				int sum=0;
				int rem=0;

				while(temp>0){
					rem=temp%10;
					sum=sum+(rem*rem*rem);
					temp=temp/10;
				}
				if(n==sum)
                    System.out.print("yes");
                else{
                    System.out.println("no");
                }              
			// }
			
		// }
	}
}