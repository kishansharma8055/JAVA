package C_program_in_java;

import java.util.Scanner;
// import java.lang.Math;

public class Equation {
    public static void main(String[] args) {
        double A, B, C, D, x, y;
        System.out.println("enter the value of A, B and C");
        Scanner scan = new Scanner(System.in);
        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();
        D = (B * B) - (4 * A * C);
        if (D > 0) {
            x = (-B + Math.sqrt(D)) / (2 * A);
            y = (-B - Math.sqrt(D)) / (2 * A);
            System.out.println("the equation is " + A + "x^2 + " + B + "x + " + C);
            System.out.printf("root is %,.2f :: %,.2f", x, y);
        }
        if (D == 0) {
            // D = -D;
            x = (-B + Math.sqrt(D)) / (2 * A);
            y = (-B - Math.sqrt(D)) / (2 * A);
            System.out.println("the equation is " + A + "x^2 + " + B + "x + " + C);
            System.out.printf("root is %,.2f :: %,.2f", x, y);
        }
        if (D < 0) {
            System.out.println("invalid");
        }
        scan.close();
    }
}
