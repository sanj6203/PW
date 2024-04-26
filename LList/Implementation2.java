package LList;

public class Implementation2 {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class Linkedlist{
        int size;
        Node head;
        Node tail;
        void insertAtEnd(int val){
            Node temp= new Node(val);
            if(head==null){
                head=tail=temp;
            }else {
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        int middle(){
            Node low=head.next;
            Node high=head;
            while(high!=null ||  high.next!=null){
                low=low.next;
                high=high.next.next;
            }
            return low.val;
        }
        void insertAtBeginning(int val){
            if(head==null){
                insertAtEnd(val);
                return;
            }
            Node temp= new Node(val);
            temp.next=head;
            head=temp;
            size++;
        }
        void deleteAt(int idx){
            Node temp= head;
            if(idx==0){
                head=head.next;
            }
            for( int i=1;i<idx;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            if(idx==size-1){
                tail=temp;
            }
            size--;
        }
        void insertAt(int idx,int val){
            if(idx==0){
                insertAtBeginning(val);
            } else if (idx==size) {
                insertAtEnd(val);
            } else if (idx<0 || idx>size) {
                System.out.println("enter valid index");
            }else {
                Node newNode= new Node(val);
                Node temp= head;
                for (int i=1;i<idx;i++){
                    temp=temp.next;
                }
                newNode.next=temp.next;
                temp.next=newNode;
                size++;
            }
        }
    }

    public static void main(String[] args) {
        Linkedlist ll= new Linkedlist();
        ll.insertAtEnd(34);
        ll.insertAtEnd(32);
        ll.insertAtEnd(45);
        ll.insertAtEnd(65);
        ll.insertAtEnd(23);
        ll.insertAtBeginning(1);
        ll.display();
        ll.insertAt(3,44);
        ll.insertAt(0,45);
        ll.insertAt(8,90);
        System.out.println(ll.size);
        ll.display();
        ll.deleteAt(0);
        System.out.println(ll.size);
        ll.deleteAt(3);
        ll.display();
        System.out.println(ll.tail.val);
        System.out.println(ll.middle());

    }
}
