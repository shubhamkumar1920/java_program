import java.util.Scanner;

public class shuffling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int n=s.length();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
           arr[i]=input.nextInt();
        }
        String str="";
        for(int i=0;i<n;i++){
            // str=str+s.charAt(arr[i]);
            // str+=s.charAt(n-i-1);
        }
        System.out.print(str);
        input.close();
    }
}
