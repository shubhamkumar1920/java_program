import java.util.Scanner;
public class matrix {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int mat[][]=new int[n][n];
	    for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
			    mat[j][i]=input.nextInt();
		    }
        }
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                System.out.print(mat[i][j]+" ");
            } 
            System.out.print('\n');
        }
        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                System.out.print(mat[j][i]+" ");
            } 
            System.out.print('\n');
        }
    }  
}