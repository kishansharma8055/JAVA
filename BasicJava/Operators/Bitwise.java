import java.util.Scanner;

// package Operators;

public class Bitwise {
    public static void main(String[] var) {
        System.out.println("ener a number");
        int a, b;
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();
        System.out.println(a | b);
        System.out.println(a & b);
        System.out.println(a << b);
        System.out.println(a >> b);
        System.out.println(a >>> b);
        System.out.println(a >>> b);
    }
}
