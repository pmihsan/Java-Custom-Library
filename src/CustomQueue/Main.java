package CustomQueue;

public class Main {
    public static void main(String[] args) {
        CustQueue q = new CustQueue();
        for(int i=0;i<8;i++){
            q.enqueue(i+5);
        }
        q.display();
        for (int i = 0; i < 20; i++) {
            q.enqueue(45+i);
        }
        q.display();
        System.out.println("Front " + q.getFront());
        System.out.println("Size " + q.getSize());
        for(int i=0;i<8;i++){
            System.out.print(q.dequeue() + " ");
        }
        System.out.println();
        q.display();
        System.out.println("Front " + q.getFront());
        System.out.println("Size " + q.getSize());
    }
}
