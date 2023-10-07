// package Inheritance;

class Data {
    protected int x, y;

    public void input(int a, int b) {
        x = a;
        y = b;
    }

    public void output() {
        System.out.println(x + " " + y);
    }
}

class maximum extends Data {
    private int max;

    public void greatest() {
        if (x > y)
            max = x;
        else
            max = y;
    }

    public void show() {
        System.out.println("greatest is " + max);
    }
}

class Single {
    public static void main(String[] args) {
        // System.out.println();
        maximum m = new maximum();
        m.input(5, 6);
        m.output();
        m.greatest();
        m.show();
    }
}