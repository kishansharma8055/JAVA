// create stack using linkedlist

class StackLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    void push(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    void pop() {
        // Node temp = head;
        head = head.next;
    }
}

class StackLinkedListMain {

    public static void main(String[] args) {
        StackLinkedList obj = new StackLinkedList();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.display();
        obj.pop();
        obj.display();
    }
}