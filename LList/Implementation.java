package LList;

public class Implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class Linkedlist{
        Node head;
        Node tail;
        void insertAtEnd(int data){
            Node temp= new Node(data);
            if(head==null){
                head=temp;
            }else {
                tail.next=temp;
            }
            tail=temp;
        }
        void display(){
            Node temp= head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        int size(){
            Node temp= head;
            int count=0;
            while (temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
        void insertAt(int idx, int data){
            Node newNode= new Node(data);
            Node temp= head;
            if(idx==0){
                insertAtBeginning(data);
            }else if(idx==size()){
                insertAtEnd(data);
            }else if(idx<0 || idx>size()){
                System.out.println("Wrong input index");
            }
            else {
                for (int i=1;i<idx;i++){
                    temp=temp.next;
                }
                newNode.next=temp.next;
                temp.next=newNode;
            }

        }
        void deleteAt(int idx){
            Node temp=head;
            if(idx==0){
                head=head.next;
            }else {
                for(int i=1;i<idx;i++){
                    temp=temp.next;
                }
                temp.next=temp.next.next;
                if(idx==size()) {
                    tail = temp;
                }
            }

        }
        int getAt(int idx){
            Node temp=head;
            for (int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        void insertAtBeginning(int data){
            Node temp= new Node(data);
            if(head==null){
                head=temp;
                tail=temp;
            }else {
                temp.next=head;
                head=temp;
            }
        }
    }
    public static void main(String args[]){
        Linkedlist ll= new Linkedlist();
        ll.insertAtEnd(3);
        ll.insertAtEnd(45);
        ll.insertAtEnd(43);
//        ll.display();
        ll.size();
        ll.insertAtBeginning(33);
//        System.out.println();
//        ll.display();
        ll.insertAt(2,12);
        System.out.println();
//        ll.display();
        System.out.println();
//        ll.insertAt(6,34);
//        ll.display();
        System.out.println();
//        System.out.println(ll.tail.data);
//        System.out.println(ll.getAt(3));
        ll.display();
        System.out.println();
        System.out.println(ll.size());
        ll.deleteAt(0);
        ll.display();
        System.out.println();
        System.out.println(ll.head.data);

    }
}
