import java.util.Scanner;
public class reverse {
    public static String reverse(String str){
        String ans="";
        int en=str.length();
        int l=en;
        for(int i=l-1;i>=0;i--){
            char c=str.charAt(i);
            String t=Character.toString(c);
            if(t.equals(" ")){
                ans+=str.substring(i+1, en);
                ans+=" ";
                en=i;
            }
        }
        ans+=str.substring(0, en);
        return ans;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s =input.nextLine();
        String d=reverse(s);
        System.out.println(d);
    }
}
