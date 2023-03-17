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
            llist1.addlast(3);
            llist1.addlast(4);
            llist1.addlast(7);
           llist1.display();
            System.out.println();
          linkedlist llist2 =new linkedlist();
          llist2.addlast(2);
          llist2.addlast(8);
          llist2.addlast(14);
          llist2.addlast(15);
          llist2.addlast(19);
            llist2.display();
            System.out.println();
//            llist1.head= new linkedlist().Merge(llist1.head, llist2.head);
//            llist1.display();

            llist1.head= new linkedlist().MergeWithoutSort(llist1.head, llist2.head);
            llist1.display();

    }
}
