import java.io.*; 
import java.util.*;
public class time {
    public static void main (String[] args) {
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        int s = input.nextInt();
        int arrt[]=new int[n];
        for(int i=0;i<arrt.length;i++){
            arrt[i]=input.nextInt();
        }
        int max = arrt[0];
        for(int i=0;i<arrt.length;i++){
            if(arrt[i]>max)
                max=arrt[i];
        }
        double second=(max*s)/1000.0;
        long anss =(long)Math.ceil(second);
        System.out.println(anss);
    } 
}