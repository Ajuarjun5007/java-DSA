package linkedlist;

import org.w3c.dom.Node;

public class doublylinkedlist {
    Node head;
    Node tail;
    int size;
    class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
            this.next=null;
            this.prev=null;
        }
    }

    doublylinkedlist(){

    }

    public void display(){
        Node temp=this.head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }

    }

    public void addlast(int val)throws Exception{
        Node newNode=new Node(val);
         if(this.size==0){
             this.head=null;
             this.tail=null;
             this.size=1;
         }else{
             newNode.next=this.head;
             this.head=newNode;
             newNode.prev=this.head;
             this.size+=1;
         }
    }
}
