import java.util.Scanner;

public class maxmin {
    public static void main(String args[]){
        int tCase,n,ar_n[],mx_n,min_n;
		Scanner sc = new Scanner(System.in);
		tCase=sc.nextInt();
		for(int i=1;i<=tCase;i++){
			n=sc.nextInt();
			ar_n=new int[n];
			for(int j=0;j<n;j++){
				ar_n[j]=sc.nextInt();
			}
            mx_n=ar_n[0];
            min_n=ar_n[0];
			for(int k=0;k<n;k++){
                if(mx_n<ar_n[k]){
                    mx_n=ar_n[k];
                }
				if(min_n>ar_n[k]){
                    min_n=ar_n[k];
                }
			}
			System.out.println(mx_n+" "+min_n);
		}
    }    
}
