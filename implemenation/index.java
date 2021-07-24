import java.util.Scanner;

// import org.graalvm.compiler.graph.NodeList.SubList;

public class index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s=input.nextLine();
        String sub=input.nextLine();
        int ls=s.length();
        int lsub=sub.length();
        // System.out.println(ls);
        for(int i=0;i<ls-lsub+1;i++){
            if(s.substring(i,i+lsub).equals(sub)){
               System.out.print(i+ " "); 
            }
        }
    }
}
