// import java.util.Scanner;

class QueueArray {
    int size, front = -1, rear = -1, arr[];

    public QueueArray(int n) {
        arr = new int[n];
        size = n;
    }

    void enqueue(int a) {
        if (rear == size - 1) {
            System.out.println("queue is full");
            return;
        }
        if (rear == -1) {
            front++;
        }
        rear++;
        arr[rear] = a;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("empty queue");
            return;
        }
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("empty queue");
            return;
        }
        int i = 0;
        while (i <= rear) {
            System.out.println(arr[i]);
            i++;
        }
    }

    void peek() {
        if (isEmpty()) {
            System.out.println("empty queue");
            return;
        }
        System.out.println(arr[0]);
    }

    boolean isEmpty() {
        if (rear == -1) {
            return true;
        }
        return false;
    }
}

class QueueArrayMain {
    public static void main(String[] args) {
        // System.out.println("enter Queue length");
        // Scanner scan = new Scanner(System.in);
        // int n = scan.nextInt();
        QueueArray obj = new QueueArray(5);
        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        obj.enqueue(4);
        obj.enqueue(5);
        obj.enqueue(6);
        obj.enqueue(7);
        System.out.println("all data in queue");
        obj.display();
        System.out.println("peek element in queue");
        obj.peek();
        System.out.println("dequeue");
        obj.dequeue();
        obj.display();
        obj.enqueue(6);
        obj.enqueue(7);
        System.out.println("after add 6");
        obj.display();
        // scan.close();
    }
}