package CustomStack;

public class CustStack {
    private static class Node{
        private int data;
        private Node next;

        public Node(int v){
            this.data = v;
            this.next = null;
        }

        public Node(int d, Node n) {
            this.data = d;
            this.next = n;
        }

    }

    private int size;
    private Node top;
    private Node head;

    public CustStack(){
        this.size = 0;
    }

    public CustStack(int data){
        this.size = 1;
        this.top = new Node(data);
    }

    public CustStack(int data, Node next){
        this.size = 1;
        this.top = new Node(data, next);
    }

    public int getSize(){
        return size;
    }

    public void push(int d){
        if(size == 0){
            head = top = new Node(d);
            size++;
            return;
        }
        Node node = new Node(d);
        top.next = node;
        top = node;
        size++;
    }

    public int getTop(){
        if(size == 0) return -1;
        return top.data;
    }

    public int pop(){
        if(size == 0){
            System.out.println("Stack Empty");
            return -1;
        }
        int d = top.data;
        Node node = head;
        while(node.next != top){
            node = node.next;
        }
        node.next = null;
        size--;
        return d;
    }
    public void display(){
        Node node = head;
        printStack(node);
        System.out.println();
    }

    public void printStack(Node n){
        if(n == null){
            return;
        }
        printStack(n.next);
        System.out.print(n.data + " ");
    }
}
