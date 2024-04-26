package LinkedLIstByRaghavGarg;

public class Implementation {
    public static void main(String[] args) throws Exception {
        LinkedLists ll= new LinkedLists();
        ll.insertAtEnd(45);
        ll.deleteHead();
        ll.display();
        ll.insertAtEnd(56);
        ll.insertAtEnd(89);
        ll.insertAtEnd(90);
        ll.display();
        ll.insertAtHead(67);
        ll.display();
        ll.insertAtIndex(3,899);
        ll.display();
//        System.out.println(ll.size());
//        System.out.println(ll.get(5));
//        ll.set(5,999);
        ll.deleteAtIndex(4);
        ll.display();
    }

}
class LinkedLists{
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    void insertAtEnd(int val) {
        Node temp= new Node(val);
        if (head == null) head=tail=temp;
        else {
            tail.next= temp;
            tail= temp;
        }
        size++;
    }
    void insertAtHead(int val){
        Node temp= new Node(val);
        temp.next= head;
        head= temp;
        size++;
    }
    void insertAtIndex(int idx, int val) throws Exception {
        if(idx==0){ insertAtHead(val); return;}
        if(idx==size){ insertAtEnd(val);return;}
        if(idx<0 || idx>size){
            throw new Exception("Index Out Of Bound!");
        }
        else {
            Node temp= new Node(val);
            Node temp1= head;
            for (int i=1;i<idx;i++){
                temp1=temp1.next;
            }
            temp.next=temp1.next;
            temp1.next=temp;
        }
        size++;

    }
    int size(){
        return size;
    }
    void display(){
        Node temp= head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    int get(int idx) throws Exception {
       if(idx<0 || idx>=size) throw new Exception("Index Out Of Bound!");
       Node temp= head;
       for (int i =1;i<=idx;i++){
           temp=temp.next;
       }
       return temp.val;
    }
    void set(int idx, int val) throws Exception {
        if(idx<0 || idx>=size) throw new Exception("Index Out Of Bound!");
        Node temp= head;
        for (int i =1;i<=idx;i++){
            temp=temp.next;
        }
        temp.val=val;
    }
    void deleteHead () throws Exception {
        if(head==null) throw new Exception("LinkedList is Empty");
        head=head.next;
        size--;
    }
    void deleteAtIndex(int idx) throws Exception {
        if(idx==0)deleteHead();
        if(idx>=size || idx<0) throw new Exception("Out of Index Bound");
        Node temp= head;
        for (int i=1;i<idx;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
}