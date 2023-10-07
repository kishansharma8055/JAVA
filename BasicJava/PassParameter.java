public class PassParameter {
    public int sum(int x, int y) { // formal parameter
        int c = x + y;
        return c;
        // System.out.println(c);
    }
}

class Main_class {
    public static void main(String[] var) {
        int a = 4, b = 3;
        PassParameter obj = new PassParameter();
        int z = obj.sum(a, b); // actual parameter
        System.out.println(z);
    }
}