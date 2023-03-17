package linkedlist;
import java.util.*;
public class client2 {
    class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
            this.prev=null;
            this.next=null;
        }
        Node(){

        }
    }

    public static void main(String[] args)throws Exception {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        linkedlist list1=new linkedlist();
        for (int i = 0; i < n; i++) {
            int ans=arr[i];
            list1.addlast(ans);
        }

        list1.display();
    }
}
