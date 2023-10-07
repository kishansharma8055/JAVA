import java.util.*;
import java.util.Scanner;

class DoWhileLoop {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        do {
            System.out.println("hello");
        } while (a < 5);
    }
}