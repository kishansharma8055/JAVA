public class Calculater {
    public static int sum(int a, int b) {
        int c = 0;
        c = a + b;
        return c;
    }

    public static int sub(int a, int b) {
        int c = 0;
        c = a - b;
        return c;
    }

    public static int mul(int a, int b) {
        int c = 0;
        c = a * b;
        return c;
    }

    public static int div(int a, int b) {
        int c = 0;
        c = a / b;
        return c;
    }

}

class MainClass {
    public static void main(String[] var) {
        int addfun = Calculater.sum(1, 2);
        int subfun = Calculater.sub(6, 2);
        int mulfun = Calculater.mul(6, 2);
        int divfun = Calculater.div(6, 2);
        System.out.println(addfun + " " + subfun + " " + mulfun + " " + divfun);
    }
}
