package linkedlist;

class nlinkedList{
    Node head;
    Node tail;

    class Node{
        int val;
        Node next;
        Node(int d){
            val=d;
            next=null;

        }
    }
    nlinkedList(){

    }
    public void addFirst(int val){
        Node newNode = new Node(val);
        Node temp = this.head;
        if(temp==null){
            newNode.next=null;
            head=newNode;
        }else{
            newNode.next=temp;
            head=newNode;
        }
    }
    public void addLast(int val){
        Node newNode = new Node(val);
        Node temp=this.head;
        if(temp==null){
            newNode.next=null;
            head=newNode;
        }else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=null;
        }
    }
public void findMiddleOfLinkedList(){
    Node temp=this.head;
    int size=0;
    while(temp!=null){
        temp=temp.next;
        size++;
    }
    int mid=size/2;
     temp=head;
    while(mid-->0){
        temp=temp.next;
    }
    System.out.print(temp.val);
}
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
    }

    public  Node Merge (Node list1,Node list2){
        Node  newNode = new Node(0);
        Node temp = newNode;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                newNode.next =list1;
                list1=list1.next;
            }else{
                newNode.next =list2;
                list2=list2.next;
            }
            newNode=newNode.next;
        }
        if(list1==null){
            newNode.next=list2;
        }else if(list2==null){
            newNode.next=list1;
        }
        return temp.next;
    }

   
    public static void main(String[] args) {
        nlinkedList list1 = new nlinkedList();
        nlinkedList list2 = new nlinkedList();
        // nlinkedList list3 = new nlinkedList();
        // list1.addFirst(3);
        // list1.addFirst(2);
        // list1.addFirst(1);
        // list1.print();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);
        list1.addLast(6);
        // list1.print();
        System.out.println();
        list2.addLast(4);
        list2.addLast(5);
        list2.addLast(7);
        list2.addLast(8);
        // list2.print();
       
        // list1.addLast(6);
        // list1.addLast(7);
        // list1.addLast(8);

        // list1.findMiddleOfLinkedList();
        list1.head =  new nlinkedList().Merge(list1.head,list2.head);     
        list1.print();
    }
}
