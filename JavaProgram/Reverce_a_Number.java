import java.util.Scanner;

class Reverce_a_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int a = scan.nextInt();
        int r, sum = 0;
        while (a > 0) {
            r = a % 10;
            sum = sum * 10 + r;
            a = a / 10;
        }
        System.out.println("reverse number is " + sum);
        scan.close();
    }
}
