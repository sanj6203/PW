package DoublyLinkedList;

public class Implementations {
    public static class Node{
        int val;
        Node next;
        Node previous;
        Node(int val) {
            this.val=val;
            this.previous=null;
            this.next=null;
        }
    }
    public static class DoublyLinkedList{
        private Node head=null;
        private Node tail=null;
        void insertAtEnd(int val){
            Node temp= new Node(val);
            if(head==null){
                head=tail=temp;
            }
            Node temp1= tail;
            tail.next=temp;
            temp.previous=temp1;
            tail=temp;
        }
        void display(){
            if(head==null)return;
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.val);
                temp=temp.next;
            }
        }
        void displayD(){
            if(tail==null)return;
            Node temp=tail;
            while(temp!=null){
                System.out.println(temp.val);
                temp=temp.previous;
            }

        }
    }

    public static void main(String[] args) {
        DoublyLinkedList db= new DoublyLinkedList();
        db.insertAtEnd(56);
        db.insertAtEnd(46);
        db.insertAtEnd(33);
        db.insertAtEnd(22);
        System.out.println(db.tail.previous.previous);
        System.out.println(db.tail.previous);
    }

}
