package linkedlist;



public class linkedlist {


    Node head;
    Node tail;
    int size;

    private class Node {     //   10-->11 12 13 14 15
        int val;
        Node next;
        Node(){

        }
        Node(int value) {
            this.val = value;
            this.next = null;

        }
    }

    //              ------------------XXXXXX---------
    public int size() {

        return this.size;
    }
    // to print linked list
    public  void display(){
        Node temp=this.head;

        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
//              ------------------XXXXXX---------

    // to get value of first node..
    public int getFirst() throws Exception {

        Node firstNode = this.head;
        if (firstNode != null) {
            return firstNode.val;

        } else {
            throw new Exception("size of linkedlist is 0 now");
        }

    }
    //              ------------------XXXXXX---------
    // to get value of last node
    public int getLast() throws Exception {

        Node lastNode = this.tail;
        if (this.size == 0) {
            throw new Exception("size of linkedlist is 0 now");
        }
        return lastNode.val;

    }
    //              ------------------XXXXXX---------
    // to get vlue of index
    public int getAt(int index) throws Exception {

        if (this.size == 0) {
            throw new Exception("size of linkedlist is 0 now");
        }
        if (index < 0 || index >= this.size) {    // -1,8
            System.out.println("Index out of bound" + "Index: "
                    + index + ",size: " + this.size);
        }
        //       1 2 3 4 5
        Node temp = this.head;
        while (index-- != 0) {
            temp = temp.next;
        }

        return temp.val;

    }
    //              ------------------XXXXXX---------
    // to get the node
    public Node getNodeat(int index) throws Exception {

        if (this.size == 0) {
            throw new Exception("size of linkedlist is 0 now");
        }
        if (index < 0 || index >= this.size) {
            System.out.println("Index out of bound" + "Index: "
                    + index + ",size: " + this.size);
        }
        Node temp = this.head;
        while (index-- != 0) {
            temp = temp.next;
        }
        return temp;

    }
    //              ------------------XXXXXX---------
    // to add first we must move pointer first..
    public void addFirst(int data) {       //    1--> 2 3 4 5
        Node newNode = new Node(data);
        if (this.size == 0) {
            this.head = newNode;
            this.tail = newNode;
            this.size = 1;
        } else {
            newNode.next = this.head;
            this.head = newNode;
            this.size += 1;
        }
    }
    //              ------------------XXXXXX---------
    // to add last we must move pointer first..
    public void addlast(int data) {

        Node newNode = new Node(data);

        if (this.size == 0) {  // 1 2 3 4 5-->6
            this.head = newNode;
            this.tail = newNode;
            this.size = 1;
        } else {
            Node tailNode = this.tail;
            tailNode.next = newNode;
            this.tail = newNode;
            this.size += 1;
        }


    }
    //              ------------------XXXXXX---------
    //to add in between the nodes
    public void addAt(int index, int data) throws Exception {

        if (this.size == 0) {  //                           1 2 4 5
            this.addFirst(data);                        //     3
            return;
        }
        if (index == this.size) {
            this.addlast(data);
            return;
        }
        if (index < 0 || index >= this.size) {
            System.out.println("Index out of bound" + "Index: "
                    + index + ",size: " + this.size);
        }
        Node newNode = new Node(data);
        Node previousNode = getNodeat(index - 1); // 1 2 4 5
        Node nextOfprevious = previousNode.next;  //          3
        newNode.next = previousNode.next;
        previousNode.next = newNode;
        this.size += 1;


    }
    //              ------------------XXXXXX---------
    public int removedFirst()throws Exception{

        if(this.size==0) {
            throw new Exception("List is empty");
        }
        int removedVal=this.head.val;
        if(this.size==0){
            this.head=this.tail=null;
        }
        this.head=this.head.next;
        this.size=-1;
        return removedVal;
    }
    //              ------------------XXXXXX---------
    // to remove last..
    public int removedLast() throws Exception{

        if(this.size==0){
            throw new Exception("List is empty");

        }
        int removedvalue=this.head.val;
        if(this.size==0){
            this.head=this.tail=null;
        }else {

            Node nodeBeforetail = this.getNodeat(this.size - 2);
            nodeBeforetail.next = null;
            this.tail = nodeBeforetail;
        }
        this.size-=1;
        return removedvalue;
    }
    //              ------------------XXXXXX---------
// to delete middle node of linked list..


    public Node deleteMiddleOfLinkedlist(Node head) {

        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        if(head!=null && head.next!=null) {
            Node temp = head;
            int size = 0;

            while (temp != null) {

                temp = temp.next;
                size++;
            }


            int mid = size / 2;


// 1 2 3 4 5 6 7
            while (mid-- > 1) { // {3>1} {2>1}
                //
                head = head.next; // h=2; h=3;
            }

            head.next = head.next.next;

        }
        return head;
    }
    //              ------------------XXXXXX---------
    public  Node Merge (Node head1, Node head2) {
//Enter your code here
        // 1 2 3
        // 5 6 7
        Node dummyNode = new Node(0);
        Node tail = dummyNode;

        while (true) {
            if (head1 == null) {
                tail.next = head2;
                break;
            }
            if (head2 == null) {
                tail.next = head1;
                break;
            }

            if (head1.val <= head2.val) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
         return dummyNode.next;
    }
    //              ------------------XXXXXX---------
    public  Node ReverseLinkedList(Node head) {
        // return the head of the modified linked list
        Node previous=null;
        Node current=head;
        Node next=null;          // 0 1 2 3 4 5-->  1 2 3 4 5-->

        while(current!=null){
            next=current.next;   //2
            current.next=previous;//null
            previous=current;     //1
            current=next;       //2
        }
        head=previous;          //1

        return head;
    //                    ----------XXXXX-----------
    }
    public Node merge(Node list1, Node list2) {
        Node temp = new Node(0);
        Node current = temp;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if (list1 ==  null) {
            temp.next = list2;
        } else if (list2 == null) {
            temp.next = list1;
        }
        return current.next;
    }
 //   -------------------xxxxxxxxxxxx-------------
    public Node MergeWithoutSort(Node head1,Node head2){
        // 1 ,2 3,4
        // 5,6,7,8
        // 1,5,2,6,3,7,4,8

            Node newNode = new Node (0);
            Node temp = newNode;

            while (head1 != null && head2 != null)  {
                newNode.next = head1; // 1
                head1 = head1.next; // 2
                newNode = newNode.next;
                newNode.next = head2;
                head2 = head2.next;
                newNode = newNode.next;
            }
            if (head1 == null) {
                newNode.next = head2;
            }
            if (head2 == null) {
                newNode.next = head1;
            }

            return temp.next;
        }
}