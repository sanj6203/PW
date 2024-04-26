package Stacks;

public class Implementations {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class Stack{
        private Node front;
        private int size=0;
        void push(int val){
            Node temp= new Node(val);
            if(front==null){
                front=temp;
                size++;
                return;
            }
            temp.next=front;
            front= temp;
            size++;
            return;
        }
        int pop(){
            if(front==null)return Integer.MIN_VALUE;
            Node temp= front;
            if(size==1){
                front=null;
                size--;
                return temp.val ;
            }
            front=front.next;
            size--;
            return temp.val;
        }
        int peek(){
            if(front==null){
                return Integer.MIN_VALUE;
            }
            return front.val;
        }
        private void helper(Node temp){
            if(temp==null)return;
            helper(temp.next);
            System.out.print(temp.val+" ");
        }
        void display(){
            System.out.print("[ ");
            helper(front);
            System.out.print("]");
            System.out.println();
        }
        int size(){
            return size;
        }
        boolean isEmpty(){
            boolean t=true;
            if(front!=null)t=false;
            return t;
        }
    }

    public static void main(String[] args) {
        Stack st= new Stack();
        st.push(45);
        st.push(55);
        st.push(67);
        st.push(78);
        st.push(98);
        st.display();
        st.pop();
        st.display();
        st.pop();
        st.display();
        st.pop();
        st.pop();
        System.out.println(st.isEmpty());
        st.pop();
        System.out.println(st.isEmpty());
        st.display();
    }
}
