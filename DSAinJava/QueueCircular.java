class QueueCircular {
    int size, arr[], front, rear;

    public QueueCircular(int n) {
        arr = new int[n];
        size = n;
        front = -1;
        rear = -1;
    }

    void enqueue(int data) {
        if (isFull()) {
            return;
        }
        if (isEmpty()) {
            front++;
        }
        rear = (rear + 1) % size;
        arr[rear] = data;
    }

    void dequeue() {
        if (isEmpty()) {
            return;
        }
        if (rear == front) {
            rear = front = -1;
        } else {
            front = (front + 1) % size;
        }

    }

    void display() {
        if (isEmpty()) {
            System.out.println("no element");
            return;
        }
        int i = front;
        while (i <= rear) {
            System.out.print(arr[i] + " ");
            i++;
        }
    }

    void peek() {
        if (isEmpty()) {
            System.out.println("no element");
            return;
        }
        System.out.println(arr[front]);
    }

    boolean isEmpty() {
        if (rear == -1 && front == -1) {
            // System.out.println("queue is empty");
            return true;
        }
        return false;
    }

    boolean isFull() {
        if ((rear + 1) % size == front) {
            // System.out.println("queue is full");
            return true;
        }
        return false;
    }

}

class QueueCircularMain {
    public static void main(String[] args) {
        // System.out.println("enter Queue length");
        // Scanner scan = new Scanner(System.in);
        // int n = scan.nextInt();
        QueueCircular obj = new QueueCircular(5);
        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        obj.enqueue(4);
        obj.enqueue(5);
        obj.enqueue(6);
        obj.enqueue(7);
        System.out.println("all data in circular queue");
        obj.display();
        System.out.println("peek element in queue");
        obj.peek();
        System.out.println("dequeue");
        obj.dequeue();
        obj.peek();
        obj.dequeue();
        obj.peek();
        obj.dequeue();
        obj.peek();
        obj.dequeue();
        obj.peek();
        obj.dequeue();
        obj.peek();
        obj.dequeue();
        System.out.println("enqueue");
        obj.enqueue(6);
        obj.enqueue(7);
        obj.peek();
        obj.dequeue();
        obj.peek();
        obj.dequeue();
        obj.peek();
    }
}