import java.util.Scanner;
public class checkspace {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
		String s=input.nextLine();
        int n=s.length();
        int flag=0;
		for(int i=0;i<=n-1;i++){
			char ch=s.charAt(i);
			if(ch==32){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
    }    
}
