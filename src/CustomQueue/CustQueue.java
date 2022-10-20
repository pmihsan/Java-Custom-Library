package CustomQueue;

public class CustQueue {

    int size = 0;
    Node front;
    Node rear;

    private class Node {
        int data;
        Node next;

        public Node(int val){
            this.data = val;
        }

        public Node(int val, Node n){
            this.data = val;
            this.next = n;
        }
    }

    public CustQueue(){
        this.size = 0;
    }

    public CustQueue(int val){
        this.front = new Node(val, null);
        this.rear = front;
        size++;
    }

    public CustQueue(int val, Node n){
        this.front = new Node(val);
        this.rear = front;
        size++;
    }

    public void enqueue(int data){
        if(size == 0){
            this.front = new Node(data, null);
            rear = front;
            size++;
            return;
        }
        rear.next = new Node(data);
        rear = rear.next;
        size++;
    }

    public int getSize() {
        return size;
    }

    public int getFront(){
        if(size == 0) return -1;
        return front.data;
    }

    public int dequeue(){
        if(size == 0) return -1;
        Node temp = front;
        front = front.next;
        size--;
        return temp.data;
    }

    public void display(){
        if(size == 0){
            System.out.println("Queue is Empty");
            return;
        }
        Node temp = front;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
