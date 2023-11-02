import java.util.concurrent.PriorityBlockingQueue;
import java.util.Queue;

class QueuePriorityBlockingQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityBlockingQueue<Integer>();
        for (int i = 1; i < 5; i++) {
            q.add(i);
        }
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.hashCode());
        System.out.println(q.remove());
        System.out.println(q.peek());
    }
}
