package CustomLinkedList;

public class Main {
    public static void main(String[] args) {
        CustLinkedList ll = new CustLinkedList();

//        ll.display();

        ll.insert(23);
        ll.display();

        for(int i=0;i<3;i++){
            ll.insert(i+30);
        }
        ll.insert(18);
        ll.display();

        System.out.println("Data Deleted " + ll.deleteAtFirst());
        ll.display();

        ll.insert(56);
        ll.display();

        System.out.println("Data Deleted " + ll.deleteAtEnd());
        ll.display();

        for(int i=0;i<3;i++){
            ll.insert((i+5));
        }
        ll.display();

        System.out.println("Data Deleted " + ll.delete(3));
        ll.display();

        System.out.println("Data Deleted " + ll.delete(0));
        ll.display();

        System.out.println("Data Deleted " + ll.delete(4));
        ll.display();

        System.out.println("Head " + ll.getHead() + " Tail " + ll.getTail());

        ll.reverse();
        ll.display();

    }
}
