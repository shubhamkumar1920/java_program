import java.io.*; 
import java.util.*;
public interface gcdprime {
    public static void main (String[] args) {
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int s=0;
        for (int i=2;i<=n;i++){
            if (n%i==0){
                s=i;
                break;
            }
        }
        int x=n/s;
        int f;
        for(int i=1;i<=m;i++){
            f=s*x;
            x++;
        }
    }
}



