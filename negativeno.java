import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int len = input.nextInt();

		int arr[] = new int[len];
		boolean Negative=false;
		for(int i=0;i<len;i++){
			arr[i] = input.nextInt();
			if(arr[i]<0){
				Negative=true;
			}
		}
		if(Negative){
			System.out.print("Yes");
		}else{
			System.out.print("No");
		}
		
	}
}