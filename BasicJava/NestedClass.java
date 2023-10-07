// import javax.sql.rowset.spi.SyncResolver;

class outer {
    private int a = 2;

    inner obj2 = new inner();

    class inner {
        public int b = 5;

        void fun2() {
            System.out.println("inner class variable" + b);
            System.out.println("outer class variable in inner class" + a);
        }
    }

    void fun() {
        obj2.fun2();
        System.out.println("outer class variable" + a);
        // System.out.println("outer class variable in inner class" + b);
    }
}

class NestedClass {
    public static void main(String[] args) {
        outer obj = new outer();
        obj.fun();
    }
}