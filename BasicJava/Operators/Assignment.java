import java.util.Scanner;

// package Operators;

public class Assignment {
    public static void main(String[] var) {

        int a;
        Scanner kk = new Scanner(System.in);
        System.out.println("enter a number ");
        a = kk.nextInt();
        operation.fun(a);
    }
}

class operation {
    public static void fun(int a) {
        a += 2;
        System.out.println(a);
        a -= 2;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 2;
        System.out.println(a);
    }
}