package PriorityQueueBy;

import java.util.PriorityQueue;

public class Self {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        pq.add(45);
        pq.add(56);
        pq.add(90);
        pq.add(77);
        System.out.println(pq);
        System.out.println(pq.size());
        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
