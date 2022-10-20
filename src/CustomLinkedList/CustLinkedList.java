package CustomLinkedList;

public class CustLinkedList {

    private int size;

    private Node head;

    private Node tail;

    private static class Node {
        int data;
        Node next;

        public Node(int val){
            this.data = val;
            this.next = null;
        }

        public Node(int val, Node n){
            this.data = val;
            this.next = n;
        }
    }

    public CustLinkedList(){
        this.size = 0;
    }

    public int getHead(){
        return head.data;
    }

    public int getTail(){
        return tail.data;
    }

    public void createNode(int data){
        Node node = new Node(data, null);
        size = 1;
        head = tail = node;
    }

    public boolean checkEmpty(){
        if(size == 0){
            System.out.println("Linked List Empty");
            return true;
        }
        return false;
    }

    public void insert(int data){
        if(size == 0) {
            createNode(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size++;
    }


    public void reverse(){
        if(size == 1) return;
        Node prev = null;
        Node curr = head;
        Node tmp = head;
        Node node;
        while(curr != null){
            node = curr.next;
            curr.next = prev;
            prev = curr;
            curr = node;
        }
        head = tail;
        tail = tmp;
    }
    public int delete(int position){
        if(checkEmpty()) return -1;
        if(position > size - 1 || position < 0) return -1;
        if(position == 0) return deleteAtFirst();
        if(position == size - 1) return deleteAtEnd();
        Node temp = head;
        for(int i=0;i<position-1;i++){
            temp = temp.next;
        }
        int value = temp.next.data;
        temp.next = temp.next.next;
        size--;
        return value;
    }

    public int deleteAtFirst(){
        if(checkEmpty()) return -1;
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    public int deleteAtEnd(){
        if(checkEmpty()) return -1;
        int value = tail.data;
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        tail = temp;
        size--;
        return value;
    }

    public void display(){
        if(checkEmpty()) return;
        if(size == 1){
            System.out.println(head.data);
            return;
        }
        Node temp = head;
        while(temp != tail){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println(tail.data + " --> NULL");
    }
}
