package linkedlist;

public class client {

        private class Node {     //   10-->11 12 13 14 15
            int data;
            Node next;
            int size;
            Node prev;
            Node(int value) {
                this.data = value;
                this.next = null;
                this.prev=null;
            }
        }

        public static void main(String[] args) throws Exception {
            linkedlist llist1 = new linkedlist();

            llist1.addlast(1);
            llist1.addlast(2);
            llist1.addlast(3);
            llist1.addlast(4);
            llist1.addlast(5);

            linkedlist llist2 = new linkedlist();
            llist2.addlast(6);
            llist2.addlast(7);
            llist2.addlast(9);
            llist2.addlast(10);
            llist2.addlast(11);
//           llist1.display();
            System.out.println();

            llist1.head= new linkedlist().Merge(llist1.head,llist2.head);
            llist1.display();

//            llist1.head= new linkedlist().mid(llist1.head);
//            llist1.display();

    }
}
