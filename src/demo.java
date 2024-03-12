class linkedlist{
    Node head;
    Node tail;

    class Node{
        int val;
        Node next;
        Node(int d){
            val=d;
            next=null;
        }
        Node(){

        }
    }
    public void display(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.val+" ->");
            temp=temp.next;
        }
    }
    public void addFirst(int val){
        Node newNode= new Node(val);
        Node temp=head;
        if(temp==null){
            newNode.next=null;
            head=newNode;
        }else{
            newNode.next=temp;
            head=newNode;
        }
    }
    public void addLast(int val){
        Node newNode= new Node(val);
        Node temp=head;
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
        Node temp=head;
            int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int mid = size/2;
        temp =head;
        while(mid-->0){
            temp=temp.next;
        }
       System.out.println(temp.val);
    }
    public void deleteMiddleOfLinkedList(){
        Node temp=head;
            int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int mid = size/2;
        temp =head;
        while(mid-->1){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    //    System.out.println(temp.val);
    }
    public static void main(String[] args) {
        linkedlist list =  new linkedlist();
        list.addFirst(6);
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        // list.findMiddleOfLinkedList();
        list.deleteMiddleOfLinkedList();
        list.display();
    }
}