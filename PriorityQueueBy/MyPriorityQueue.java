package PriorityQueueBy;

import java.util.PriorityQueue;

public class MyPriorityQueue {
    public static void main(String[] args) {
        // Creating a priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements to the priority queue
        pq.offer(5);
        pq.offer(2);
        pq.offer(8);
        pq.offer(1);

        // Printing the elements of the priority queue
        System.out.println("Elements of the priority queue: " + pq);

        // Removing elements from the priority queue
        while (!pq.isEmpty()) {
            System.out.println("Removed element: " + pq.poll());
        }
    }
}

