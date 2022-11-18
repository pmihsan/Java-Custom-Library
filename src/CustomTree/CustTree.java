package CustomTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CustTree {

    private int nodeCount;
    private Node root;

    private static class Node {
        int data;
        Node left;
        Node right;

        private Node(int val){
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }

    public CustTree(){
        this.nodeCount = 0;
    }

    private Node insertNode(Node head, int data){
        if(head == null){
           return new Node(data);
        }
        if(data < head.data) {
            head.left = insertNode(head.left, data);
        }
        else if(data > head.data){
            head.right = insertNode(head.right, data);
        }
        // Else it exists
        return head;
    }

    public void addNode(int value){
        root = insertNode(root,value);
        nodeCount++;
    }

    public int getNodeCount(){
        return nodeCount;
    }

    public void display(){
        Scanner in = new Scanner(System.in);
        System.out.println("1)Inorder\n2)Preorder\n3)Postorder\n4)Level order");
        int n = in.nextInt();
        if(n == 1){
            inorder(root);
        }
        else if(n == 2){
            preorder(root);
        }
        else if(n == 3){
            postorder(root);
        }
        else {
            levelorder(root);
        }
        System.out.println();
    }

    private void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    private void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    private void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    private void levelorder(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            if(queue.peek().left != null && queue.peek().right != null){
                queue.add(queue.peek().left);
                queue.add(queue.peek().right);
            }
            else if(queue.peek().right != null){
                queue.add(queue.peek().right);
            }
            else if(queue.peek().left != null){
                queue.add(queue.peek().left);
            }
            System.out.print(queue.remove().data + " ");
        }
    }
}
