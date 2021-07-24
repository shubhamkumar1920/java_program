import java.util.LinkedList;
import java.util.Scanner;

public class single {
        Node head;
    static class Node{
        int  data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public void printlist(){
        Node n=head;
        System.out.println("print the node");
        while(n != null){
            System.out.print(n.data + " ");
            n=n.next;
        }
        System.out.println();
    }
    public void inserthead(int data){
        Node s=new Node(data);
        if(head==null){
            head=s;
        }
        s.next=head;
        head=s;
    }
    public void insertlast(int data){
        Node w=new Node(data);
        if(head==null){
            head=w;
        }
        Node last=head;
        while (last.next !=null) {
            last=last.next;
        }
        last.next=w;
        return;
    }
    public void insertatpos(int pos,int data){
        Node w=new Node(data);
        Node cur=head,prev=null;
        w.next=null;
        if(pos<1){
            System.out.println("Invalid positon");
        }
        if(pos==1){
            w.next=head.next;
            head.next=w;
            return;
        }else{
            int counter=1;
            while (cur != null && pos != counter ) {
               counter++;
               cur=cur.next;
            }
            if(pos>counter){
                System.out.println("size out");
            }else{
                w.next=cur.next;
                cur.next=w;
            }
        }
    }
    public void deletehead(){
        if(head==null){
            return;
        }
        head=head.next;
    }
    public void deletelast(){
        if(head==null){
            return;
        }
        Node last=head;
        while (last.next.next !=null) {
            last=last.next;
        }
        last.next=null;
        return;
    }
    public void size(){
        int si=0;
        Node n=head;
        while(n !=null){
            si++;
            n=n.next;
        }
        System.out.println(si);
    }
    public void deleteposition(int pos){
        Node f=head;
        Node s=head;
        int p=pos-1;
        for(int j=2;j<=p;j++){
            f=f.next;
        }
        if(pos==1){
            s=s.next;
        }
        f.next=f.next.next;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        single list = new single();
        System.out.println("input the first node :");
        int a=input.nextInt();
        list.head=new Node(a); 
        while(true){
            System.out.println("1.insert 2.delte 3.display 4.exit 5.size");
            n=input.nextInt();
            if(n==4){
                break;
            }
            if(n==1){
                System.out.println("inset the node 1.head 2.at postion 3.last");
                int p=input.nextInt();
                if(p==1){
                    System.out.println("insert the data");
                    int e=input.nextInt();
                    list.inserthead(e);
                }
                if(p==2){
                    System.out.println("input the position");
                    int q=input.nextInt();
                    System.out.println("input the data");
                    int o=input.nextInt();
                    list.insertatpos(q,o);
                }
                if(p==3){
                    System.out.println("input the data");
                    int g=input.nextInt();
                    list.insertlast(g);
                }
            }
            if(n==2){
                System.out.println("delete the node 1.head 2.at postion 3.last");
                int d=input.nextInt();
                if(d==1){
                    list.deletehead();
                }
                if(d==2){
                    int y=input.nextInt();
                    list.deleteposition(y);
                }
                if(d==3){
                    list.deletelast();
                }
            }
            if(n==3){
                list.printlist();
            }
            if(n==5){
                list.size();
            }
        }        
    }
}