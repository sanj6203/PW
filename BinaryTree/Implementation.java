package BinaryTree;

public class Implementation {
    public static void printr(Node head){
        if(head==null)return;
        System.out.print(head.val+" ");
        printr(head.left);
        printr(head.right);
    }
    public static class Node{
        int val;
        Node left;
         Node right;
        Node(int val){
            this.val=val;
        }

    }
    public static void displayr(Node head){
        if(head==null)return;
        System.out.print(head.val+" -> ");
        if(head.left!=null) System.out.print(head.left.val +" ");
        if(head.left==null)System.out.print("null ,");
        if (head.right!=null) System.out.print(head.right.val);
        if (head.right==null) System.out.println("null ");
        System.out.println();
        displayr(head.left);
        displayr(head.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a= new Node(2);
        Node b= new Node(3);
        Node c= new Node(4);
        Node d= new Node(5);
        Node e= new Node(6);
        root.left=a;
        root.right=b;
        a.left=c;
        a.right=d;
        b.right=e;
//        printr(root);
        displayr(root);
    }
}
