import java.util.Scanner;
import java.lang.Math;
public class prime {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

		for(int i=1;i<=t;i++){
            int n = input.nextInt();
            int flag=0;
            int s=(int)Math.sqrt(n);
            for(int j=2;j<=s;j++){
                if(n%j==0){
                    System.out.println("No");
                    flag=1;
                    break;
                }
            }	
            if(flag==0){
                System.out.println("Yes");
            }
        }
        
    }
}