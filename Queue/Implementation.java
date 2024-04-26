package Queue;

public class Implementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class Queue{
        private Node front;
        private Node rear;
        private int size;
        void enqueue(int x){
            Node temp= new Node(x);
            if(front==null){
                front=rear= temp;
                size++;
                return;
            }
            rear.next=temp;
            rear=temp;
            size++;
            return;
        }
        int peek(){
            return rear.val;
        }
        void display(){
            Node temp= front;
            while (temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        int dequeue(){
            Node temp= front;
            front=front.next;
            size--;
            return temp.val;
        }
        int size(){
            return size;
        }
        boolean isEmpty(){
            boolean full= true;
            if(front!=null) full=false;
            return full;
        }

    }
    public static void main(String args[]){
        Queue qu= new Queue();
        qu.enqueue(45);
        qu.enqueue(55);
        qu.enqueue(56);
        qu.enqueue(88);
        qu.display();
        qu.dequeue();
        System.out.println(qu.peek());
        qu.display();
        System.out.println(qu.isEmpty());
    }
}
