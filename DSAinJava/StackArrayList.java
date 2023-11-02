// create a stack using ArrayList

import java.util.ArrayList;

class StackArrayList {
    ArrayList<Integer> al = new ArrayList<>();

    void push(int data) {
        al.add(data);
    }

    void display() {
        System.out.println(al);
    }

    void pop() {
        al.remove(al.size() - 1);
    }

    public static void main(String[] args) {

        StackArrayList obj = new StackArrayList();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.display();
        obj.pop();
        obj.display();
    }
}
