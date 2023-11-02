// create a Queue using LinkedList
// head    |1|2|3|4|5|6|   tail

class QueueLinkedList {

    Node head = null;
    Node tail = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    void enqueue(int a) {
        Node newnode = new Node(a);
        if (tail == null) {
            tail = head = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    void dequeue() {
        if (tail == null) {
            System.out.println("queue is empty");
            return;
        }
        head = head.next;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("Null" + "\n");
        System.out.println("hello" + "\t" + "kishan");
    }

    void peek() {
        if (tail == null) {
            System.out.println("queue is empty");
            return;
        }
        System.out.println(head.data);
    }
}

class QueueLinkedListMain {
    public static void main(String[] args) {
        // System.out.println("enter Queue length");
        // Scanner scan = new Scanner(System.in);
        // int n = scan.nextInt();
        QueueLinkedList obj = new QueueLinkedList();
        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        obj.enqueue(4);
        obj.enqueue(5);
        obj.enqueue(6);
        obj.enqueue(7);
        System.out.println("all data in Queue using LL");
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
        System.out.println("all data");
        obj.display();
    }
}