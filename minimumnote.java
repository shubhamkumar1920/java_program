import java.util.Scanner;
public class minimumnote {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int r=200,s=500,t=100;
        int sum=0,sum1=0;
        if(n<=s && n>2*r){
            sum=s-n;
        }
        if(n<=r){
            sum=r-n;
        }else if(n<=2*r){
            sum=2*r-n;
        }
        if(n>s){
            sum=100-n%100;
        }
        if(n>s && n%t==0){
            sum=0;
        }
        System.out.println(sum);
    } 
}

