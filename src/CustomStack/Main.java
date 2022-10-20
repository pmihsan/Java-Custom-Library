package CustomStack;


public class Main {
    public static void main(String[] args) {
        CustStack cus = new CustStack();
        for (int i = 0; i < 5; i++) {
            cus.push(i+1);
        }
        System.out.println("The size of stack is " + cus.getSize());
        cus.display();
        System.out.println("Popped " + cus.pop());
        System.out.println("The size of stack is " + cus.getSize());
        cus.display();
    }
}
