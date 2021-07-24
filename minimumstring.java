import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class minimumstring {
	static String Minimum(String s,int l) { 
        String ans = "";   
        for (int i = 0; i < l-1; i++) {  
            if (s.charAt(i) > s.charAt(i + 1)) {  
                for (int j = 0; j < l; j++) { 
                    if (i != j) { 
                        ans += s.charAt(j); 
                    } 
                } 
                return ans; 
            } 
        } 
        ans = s.substring(0, l - 1); 
        return ans; 
    } 
    public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		int l = input.nextInt();
        String s = input.next();
		System.out.print(Minimum(s,l));	
    } 
}
