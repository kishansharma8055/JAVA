// Manually linkedlist
class LinkedList_Manually {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    void addFirst(int a) {
        Node newnode = new Node(a);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    void addPos(int p, int a) {
        Node newnode = new Node(a);
        if (head == null) {
            head = newnode;
        }
        Node temp = head;
        int i = 1;
        while (i < (p - 1)) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    void addLast(int a) {
        Node newnode = new Node(a);
        if (head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    void removeFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    void removePos(int p) {
        if (head == null) {
            return;
        }
        Node temp = head;
        int i = 1;
        while (i < (p - 1)) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;

    }

    void removeLast() {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // find a length
    int length() {
        if (head == null) {
            return 0;
        }
        int i = 0;
        Node temp = head;
        while (temp != null) {
            i++;
            temp = temp.next;
        }
        return i;
    }

    void display() {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

}

// class exerciseMain {
// public static void main(String[] args) {
// exercise obj = new exercise();
// System.out.println("add last");
// obj.addLast(1);
// obj.addLast(2);
// obj.addLast(3);
// obj.addLast(4);
// obj.addLast(5);
// obj.addLast(6);
// obj.display();
// System.out.println("add first");
// obj.addFirst(7);
// obj.display();
// System.out.println("add Position");
// obj.addPos(4, 10);
// obj.display();
// System.out.println("remove first");
// obj.removeFirst();
// obj.display();
// System.out.println("remove Position");
// obj.removePos(4);
// obj.display();
// System.out.println("remove last");
// obj.removeLast();
// obj.display();
// System.out.println("length of linkedlist");
// // int k = obj.length();
// System.out.println(obj.length());
// }
// }

// Recursion not work

// Reverse by Recursion
// public Node reverseByRecursion() {
// Node newHead = reverseByRecursion(head.next);
// head.next.next = head;
// head.next = null;
// return newHead;
// }

// Reverse by Iterative
// public void reverseByIterative() {
// Node pre = head;
// Node curr = head.next;
// while (curr != null) {
// Node nextnode = curr.next;
// curr.next = pre;
// // update
// pre = curr;
// curr = nextnode;
// }
// }