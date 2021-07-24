import java.util.Scanner;

public class sorting1 {
    public static int[] mergesort(int[] arr,int low,int high){
        if(low==high){
            int[] ba = new int[1];
            ba[0]=arr[low];
            return ba;
        }
        int mid=(low+high)/2;
        int[] f=mergesort(arr, low, mid);
        int[] s=mergesort(arr, mid+1, high);
        int[] sh=merge(f,s);
        return sh;
    }
    public static int[] merge(int[] a,int[] b){
        int i=0,j=0,k=0;
        int[] ans=new int[a.length+b.length];
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                ans[k]=a[i];
                k++;
                i++;
            }else{
                ans[k]=b[j];
                j++;
                k++;
            }
        }
        while(i<a.length){
            ans[k]=a[i];
            k++;
            i++;
        }
        while(j<b.length){
            ans[k]=b[j];
            j++;
            k++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int[] ans=mergesort(arr,0,n-1);
        for(int item: arr){
            System.out.println(item + " ");
        }
    }
}
