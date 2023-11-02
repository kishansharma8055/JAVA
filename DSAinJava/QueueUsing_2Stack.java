import java.util.*;

class QueueUsing_2Stack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    QueueUsing_2Stack() {

    }

    void add(int data) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(data);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    void remove() {
        if (s1.isEmpty()) {
            System.out.println("queue is empty");
            return;
        }
        System.out.println(s1.pop());
    }

    void peek() {
        if (s1.isEmpty()) {
            System.out.println("queue is empty");
            return;
        }
        System.out.println(s1.peek());
    }

    boolean isEmpty() {
        return s1.isEmpty();
    }

}

class QueueUsing_2StackMain {
    public static void main(String[] args) {
        QueueUsing_2Stack obj = new QueueUsing_2Stack();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.peek();
        obj.remove();
        obj.peek();
        obj.add(10);
        obj.remove();
        obj.remove();
        obj.remove();
        obj.remove();
        obj.remove();
        obj.add(4);
        obj.peek();
    }
}