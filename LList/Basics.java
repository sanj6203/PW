package LList;

public class Basics {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static int length(Node head){
        int count=0;
        while (head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public static void displayReverse(Node head){
        if(head==null)return;
        displayReverse(head.next);
        System.out.print(head.data+" ");
    }
    public static void display(Node head){
        if(head==null)return;
        System.out.print(head.data+" ");
        display(head.next);
    }

    public static void main(String[] args) {
        Node a= new Node(5);
        Node b= new Node(9);
        Node c= new Node(13);
        Node d= new Node(18);
        Node e= new Node(21);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

//        Node temp= a;
//        for (int i=0;i<5;i++){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }


        display(a);
//        Node temp=a;
//        System.out.println();
//        while (temp!=null){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }
        System.out.println();
        displayReverse(a);
        System.out.println();
        int len=length(a);
        System.out.println(len);
    }
}
