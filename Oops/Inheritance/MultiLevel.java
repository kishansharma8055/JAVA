// package Inheritance;

class student {
    private String name;
    private int id;

    public void input(String s, int id) {
        name = s;
        this.id = id;
    }

    public void display() {
        System.out.println(name + " " + id);
    }
}

class Test extends student {
    protected int sub1, sub2;

    public void input_marks(int a, int b) {
        sub1 = a;
        sub2 = b;
    }

    public void display() {
        super.display();
        System.out.println(sub1 + " " + sub2);
    }
}

class result extends Test {
    private float total;

    public void display() {
        total = sub1 + sub2;
        super.display();
        System.out.println(total);
    }
}

class MultiLevel {
    public static void main(String[] args) {
        // System.out.println();
        result obj = new result();
        obj.input("kishan", 20);
        obj.input_marks(99, 98);
        obj.display();
    }
}
