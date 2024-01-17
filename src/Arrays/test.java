
package Arrays;
import org.w3c.dom.Node;
import java.util.*;

class pLinkedList{
    Node head;
    class Node{
        Node next;
        int val;
        Node(int data){
            this.val=data;
            this.next=null;
        }
    }
    pLinkedList(){

    }
    public void display(){
                Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+"->");
                temp=temp.next;
            }
    }
    public void addFirst(int val){
        Node newNode = new Node(val);
        if(head==null){
            head=newNode;
        } else{
            newNode.next=head;
            head=newNode;
        }
    }
    public Node merge(Node head1,Node head2){
        Node newNode=new Node(0);
        Node temp=newNode;
        while(head1!=null&&head2!=null){
            if(head1.val<=head2.val){
                temp.next=head1;
                head1=head1.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
            }
            temp=temp.next;
        }
        if(head1==null){
            temp.next=head2;
        }
        if(head2==null){
            temp.next=head1;
        }
        head=newNode.next;
        return head;
    }

    public Node delmid(Node head){
        Node temp=head;
        int size=0;
        while (temp!=null){
            size++;
            temp=temp.next;
        }
        int mid=size/2;
        while(mid-->1){
            head=head.next;
        }
        head.next=head.next.next;
        return head;
    }
    public Node reverse(Node head){
        Node prev=null;
        Node currnt=head;
        Node next=null;
        while (currnt!=null){
            next=currnt.next;
            currnt.next=prev;
            prev=currnt;
            currnt=next;
        }
        head=prev;
        return head;
    }

    public static void main(String[] args) {
        pLinkedList linkedlist1 = new pLinkedList();
        pLinkedList linkedlist2 = new pLinkedList();

        linkedlist1.addFirst(5);
        linkedlist1.addFirst(4);
        linkedlist1.addFirst(3);
        linkedlist1.addFirst(2);
        linkedlist1.addFirst(1);
//        linkedlist1.display();

        linkedlist2.addFirst(5);
        linkedlist2.addFirst(3);
        linkedlist2.addFirst(1);
//        linkedlist2.display();

        linkedlist1.head = new pLinkedList().merge(linkedlist1.head, linkedlist2.head);
        linkedlist1.display();
    }
}
