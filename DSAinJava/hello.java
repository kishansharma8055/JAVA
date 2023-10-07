public class hello {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.fun();
        System.out.println("this is hello class");
    }
}

class Test {
    void fun() {
        System.out.println("this is test class");
    }
}