package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementationsByShradha {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    static  Node root;

    public static class BinaryTree{
        private static int idx =-1;
        void buildTree(int[] nodes){
            root=helper(nodes);
        }
        private Node helper(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode= new Node(nodes[idx]);
            newNode.left= helper(nodes);
            newNode.right=helper(nodes);

            return newNode;
        }
        void preOrder(){
            displayHelper(root);
            System.out.println();
        }
        void displayHelper(Node root){
            if(root==null)return;
            System.out.print(root.val+" ");
            displayHelper(root.left);
            displayHelper(root.right);
        }
        void postOrder(){
            helperPost(root);
            System.out.println();
        }
        void helperPost(Node root){
            if(root==null)return;
            helperPost(root.left);
            helperPost(root.right);
            System.out.print(root.val+" ");
        }
        void inOrder(){
            helperIn(root);
            System.out.println();
        }

        private void helperIn(Node root) {
            if(root==null)return;
            helperIn(root.left);
            System.out.print(root.val+" ");
            helperIn(root.right);
        }
        void levelOrder() {
            if (root == null) return;
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null); // Add a null delimiter to mark the end of the first level
            while (!q.isEmpty()) {
                Node curr = q.poll();
                if (curr == null) {
                    System.out.println(); // Print newline to move to the next level
                    if (!q.isEmpty()) {
                        q.add(null); // Add a null delimiter for the next level
                    }
                } else {
                    System.out.print(curr.val + " "); // Print the value of the current node
                    if (curr.left != null) q.add(curr.left);
                    if (curr.right != null) q.add(curr.right);
                }
            }
        }



    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt= new BinaryTree();
        bt.buildTree(nodes);
        bt.preOrder();
        bt.inOrder();
        bt.postOrder();
        bt.levelOrder();


    }
}
