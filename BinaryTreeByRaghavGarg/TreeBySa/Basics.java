package BinaryTreeByRaghavGarg.TreeBySa;

public class Basics {
    public static void display(Node root){
        if(root==null)return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    public static int sum(Node root){
        if(root==null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    public static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
    }

    public static int multiply(Node root){
        if(root==null) return 1;
        return root.val * multiply(root.left)* multiply(root.right);
    }

    public static int level(Node root){
        if(root==null)return 0;
        return 1+ Math.max(level(root.left),level(root.right));
    }

    public static int height(Node root){
        if(root.left == null && root.right == null)
            return 0;
        if(root.left == null)
            return 1 + height(root.right);
        if(root.right == null)
            return 1 + height(root.left);
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        Node root= new Node(1);
        Node a= new Node(2);
        Node b= new Node(3);
        Node c= new Node(4);
        Node d= new Node(5);
        Node e= new Node(6);
        Node f= new Node(7);

        root.left=a;
        root.right=b;
        a.left=c;
        a.right=d;
        d.left=e;
        e.right=f;

        display(root);
        System.out.println();
        System.out.println(sum(root));
        System.out.println(max(root));
        System.out.println(multiply(root));
        System.out.println(level(root));
        System.out.println(height(root));

    }
}

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}