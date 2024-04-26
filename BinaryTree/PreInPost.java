package BinaryTree;

public class PreInPost {
    public static class Node{
         int val;
        Node left;
         Node right;
        Node(int val){
            this.val=val;
        }

    }
    public static void preOrder(Node root){
        if(root==null)return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){
        if(root==null)return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);

    }
    public static void postOrder(Node root){
        if(root==null)return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
    public static void nthLevel(Node root ,int n){
        if(root==null)return;
        if(n==1) {
            System.out.print(root.val+" ");
            return;
        };
        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);

    }
    public static void main(String[] args) {
        Node root= new Node(1);
        Node a= new Node(2);
        Node b= new Node(3);
        root.left=a;
        root.right=b;
        Node c= new Node(4);
        Node d= new Node(5);
        a.left=c;
        a.right=d;
        Node e= new Node(6);
        b.left=e;
        Node f= new Node(7);
        b.right=f;

//        System.out.println("preorder");
//        preOrder(root);
//        System.out.println();
//        System.out.println("inorder");
//        inOrder(root);
//        System.out.println();
//        System.out.println("postorder");
//        postOrder(root);
        nthLevel(root,3);
    }
}
