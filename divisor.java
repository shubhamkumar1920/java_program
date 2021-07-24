import java.util.Scanner;
public class divisor {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for(int i=1;i<=t;i++){
            int n = input.nextInt();
            int c=0;
            int s=(int)Math.sqrt(n);
            for(int j=1;j<=s;j++){
                if(n%j==0){
                    int x=j,y=n/j;
                    if(x*x==n){
                        if(x%2==0){
                            c++;
                        }
                    }else {
                        if(x%2==0 ){
                            c++;
                        }
                        if(y%2==0){
                            c++;
                        }
                    }  
                }
            }
            System.out.println(c);
        }   
    }
}

// kumaranuj22799@gmail.com
// "file": "https://inshare-yst.herokuapp.com/files/ee3bf04e-127a-4dff-b6f1-d08ce0d1

// int count=0;
//   for(int i=1;i<=Math.sqrt(N);i++){
//     if(N%i==0){
//       if(N/i==i){
//         count++;
//       }else{
//         count=count++;
//       }
//     }
//   }
//   return count;