import java.util.Scanner;
public class spiralmat {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int mat[][]=new int[n][n];
	    for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
			    mat[i][j]=input.nextInt();
		    }
        }
        int k,sr=0,sc=0;
        int er,ec;
        er=ec=n;
        int ic=0;
        int fc=er*ec;      
        while (sr<er && sc<ec){
            if (ic==fc)
                break; 
            for (k = sr;k<er;++k){
                System.out.print(mat[k][sc] + " ");
                ic++; 
            } 
            sc++;
            if (ic==fc) 
                break; 
            for (k=sc;k<ec;++k){
                System.out.print(mat[er-1][k] + " "); 
                ic++; 
            } 
            er--;
            if (ic==fc) 
                break;  
            if (sr<er){
                for (k=er-1;k>=sr;--k){
                    System.out.print(mat[k][ec-1] + " "); 
                    ic++; 
                } 
                ec--; 
            }
            if (ic==fc) 
                break;
            if (sc<ec){ 
                for (k=ec-1;k>=sc;--k){ 
                    System.out.print(mat[sr][k] + " "); 
                    ic++; 
                } 
                sr++; 
            } 
        }
    }
}




// // You need to return the count of Primes less than equal to N
// // N: input number
// function numberOfPrimes(N)
//  {
//    var res =  sieveOfEratosthenes(N) ;
//    return res ;
//  }
//      //      var count = 0 ;
// //        for(var i = 1 ; i<= N ; i++){
// //        var res = isPrime(i);
// //        if(res == true){
// //              count++;
// //        }
// // }
// // return count ;
// //       // Your code here
// //  }
// // function isPrime(n) 
// // { 
// // // Corner case 
// // if (n <= 1) 
// //     return false; 
  
// // // Check from 2 to n-1 
// // for (var i = 2; i < n; i++) 
// //     if (n % i == 0) 
// //         return false; 
  
// // return true; 

// // new one 
//  function sieveOfEratosthenes(n) 
//     { 
//         // Create a boolean array "prime[0..n]" and initialize 
//         // all entries it as true. A value in prime[i] will 
//         // finally be false if i is Not a prime, else true. 
//         var prime= new Array(n+1) ; var count = 0;   //var flag = new Array(n+1) ;
//         for(var i=0;i<=n;i++) 
//             prime[i] = true; 
          
//         for(var p = 2; p*p <=n; p++) 
//         { 
//             // If prime[p] is not changed, then it is a prime 
//             if(prime[p] == true) 
//             { 
//                 // Update all multiples of p 
//                 for(var i = p*p; i <= n; i += p) 
//                     prime[i] = false; 
//             } 
//         } 

          
//        // count all prime numbers 
//         for(var i = 2; i <= n; i++) 
//         { 
//             if(prime[i] == true) {
//               //  console.log(prime[i] + " ");
//                count++; 
//             }
//         } 
//         return count ;
//     }