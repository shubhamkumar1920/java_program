import java.util.Scanner;
public class spiralclock {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int mat[][]=new int[n][n];
	    for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
			    mat[j][i]=input.nextInt();
		    }
        }
        int k,sr=0,sc=0;
        int er,ec;
        er=ec=n;
        while (sr < er && sc < ec) {
            // Print the first row from the remaining rows
            for (k = sc; k < ec; ++k) {
                System.out.print(mat[sr][k] + " ");
            }
            sr++;
            // Print the last column from the remaining columns
            for (k = sr; k < er; ++k) {
                System.out.print(mat[k][ec - 1] + " ");
            }
            ec--;
            // Print the last row from the remaining rows
            if (sr < er) {
                for (k = ec - 1; k >= sc; --k) {
                    System.out.print(mat[er - 1][k] + " ");
                }
                er--;
            }
            // Print the first column from the remaining columns */
            if (sc < er) {
                for (k = er - 1; k >= sr; --k) {
                    System.out.print(mat[k][sc] + " ");
                }
                sc++;
            }
        }
    }  
}