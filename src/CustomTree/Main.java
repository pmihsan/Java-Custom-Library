package CustomTree;

public class Main {
    public static void main(String[] args) {
        System.out.println("Binary Search Tree");

        CustTree bt = new CustTree();
        bt.addNode(23);
        bt.addNode(43);
        bt.addNode(12);
        bt.addNode(7);
        bt.addNode(90);
        bt.addNode(73);
        bt.addNode(9);

        /*
                    23
                   /  \
                 12    43
                /       \
               7         90
                \       /
                 9     73
         */

        System.out.println("Node Count " + bt.getNodeCount());

        bt.display();
    }
}
