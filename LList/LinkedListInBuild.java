package LList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListInBuild {
    public static void main(String[] args) {
        LinkedList<Integer> ll= new LinkedList<>();
        ll.add(45);
        ll.add(90);
        ll.add(89);
        ll.add(36);
        ll.add(45);
        ll.add(90);
        ll.add(88);
//        System.out.println(ll);
//        System.out.println(ll.size());
//        System.out.println(ll.isEmpty());
//        ll.remove(5);
        System.out.println(ll.poll());
        System.out.println(ll);

    }
}
