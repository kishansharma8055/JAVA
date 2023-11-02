class Test1 {
    Node head;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    void insert(int data) {
        Node newnode = new Node(data);
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

    // // find n^th node from last and delete
    int size() {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }

    void search(int key) {
        if (head == null) {
            return;
        }
        Node temp = head;
        int i = 1;
        int k = size() - key;
        System.out.println("k value is " + k);
        while (i < k) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        System.out.println("i and k is " + i + k);
    }

    // // Q. 2 Palindrom in linkedlist
    // // steps
    // // 1. middle of limkedlist
    // // 2. 2nd half reverse
    // // 3. match first half and second half
    Node reverse(Node head) {
        Node pre = null;
        Node cur = head;

        while (cur != null) {
            Node next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    Node firstMiddle() {
        Node hare = head;
        Node turtle = head;
        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        Node middle = firstMiddle(); // first half ks end
        Node secondHalfStart = reverse(middle.next);

        Node firstHalfStart = head;
        while (secondHalfStart != null) {
            if (firstHalfStart.data != secondHalfStart.data) {
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }

    // Q. 3 deteact loop in linkedlist
    boolean hasCycle() {
        if (head == null) {
            return false;
        }
        Node hare = head; // fast
        Node turtle = head; // slow

        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
            if (hare == turtle) {
                return true;
            }
        }
        return false;
    }

    // display element
    void display() {
        if (head == null)
            return;
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}

class Main_method {

    public static void main(String[] args) {
        Test1 obj = new Test1();
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(3);
        obj.insert(2);
        obj.insert(1);
        System.out.println("display all data");
        obj.display();
        obj.search(3);
        System.out.println("display after search and delete");
        obj.display();
        System.out.println("display after palindrom search");
        System.out.println(obj.isPalindrome());
        obj.display();
        System.out.println("cycle " + obj.hasCycle());
    }
}
