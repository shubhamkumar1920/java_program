import java.util.Scanner;
public class divi {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int c=0;
        // int s = (int)Math.sqrt(100);
        for(int i=1;i<=100;i++){
            if(i%n==0){   
                c++;
            }
        }
        System.out.println(c);
    }

}
