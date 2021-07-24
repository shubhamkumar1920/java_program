import java.util.Scanner;
public class palindrome1 {
    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        String s=input.nextLine();
        int len=s.length()-1;
        int output=1;
        int i=0;
        while(i<=len){
            if(s.charAt(i)!=s.charAt(len)){
                output=0;
                break;
            }
            i++;
            len--;
        }
        if(output==1){
            System.out.println("Yes");
        }else{
            System.out.println("no");
        }
    }
}