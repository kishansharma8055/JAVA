
// import java.util.Random;

// public class ExceptionHandling {
// public static void main(String[] args) {
// int a = 0, b = 0, c = 0;
// Random r = new Random();
// for (int i = 0; i < 3200; i++) {
// try {
// b = r.nextInt();
// c = r.nextInt();
// a = 12345 / (b / c);
// } catch (ArithmeticException e) {
// System.out.println("divide by zero");
// a = 0;
// }
// System.out.println("a" + a);
// }
// }
// }

//
//
//
//
//
//

class ExceptionHandling {
    static void procA() {
        try {
            System.out.println("inside procA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("finally procA");
        }
    }

    static void procB() {
        try {
            System.out.println("inside procB");
            return;
        } finally {
            System.out.println("finally procB");
        }
    }

    static void procC() {
        try {
            System.out.println("inside procC");
            // throw new RuntimeException('demo');
        } finally {
            System.out.println("finally procC");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
        procB();
        procC();
    }
}