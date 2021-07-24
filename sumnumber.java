import java.util.Scanner;
import java.io.*; 
import java.util.*;

public class sumnumber{
//     public static void main (String[] args) {
// 		Scanner input = new Scanner(System.in);
// 		long n = input.nextLong();
// 		long sum=0;
// 		while(n!=0){
// 			sum=sum+n%10;
// 			n=n/10;
// 		}
// 		System.out.println(sum);
// 	}

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws java.lang.Exception{
	String s = br.readLine();
	long sum = 0;
	for (int i = 0; i <s.length() ; i++) {
		sum=sum + Integer.parseInt(String.valueOf(s.charAt(i)));
	}
	System.out.println(sum);
}
}