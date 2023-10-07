import java.util.Scanner;

public class ArithmaticOperator {
    public static void main(String[] args) {
        int a, b;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter two numbet");
        a = obj.nextInt();
        b = obj.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

    }
}
