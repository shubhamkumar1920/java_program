import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class charr {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next();
		String p = input.next();
		if(s.charAt(0)=='R' || p.charAt(0)=='R'){
			System.out.println("R");
		}else if(s.charAt(0)=='J'){
			System.out.println(p);
		}else if(p.charAt(0)=='J'){
			System.out.println(s);
		}else{
			System.out.println("D");
		}
	}
}
