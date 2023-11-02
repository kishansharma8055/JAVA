import java.util.*;

class QueuePriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        for (int i = 1; i < 5; i++) {
            q.add(i);
        }

        // iterator in java
        Iterator<Integer> iterator = q.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.println("use a poll method");
        // peek() method only print top element
        System.out.println(q.peek());
        // poll() method print top element and remove it
        System.out.println(q.poll());
        System.out.println(q.peek());

        System.out.println("all element using dynamically" + q);
        System.out.println("size of queue" + q.size());
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        System.out.println("size of queue" + q.size());
        System.out.println("hello");
    }
}
