import java.util.Scanner;

class Factorial {

    public static void FactorialFun(int a) {
        int fact = 1;
        for (int i = a; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
        return;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number for factorial");
        int n = scan.nextInt();
        FactorialFun(n);
        scan.close();
    }

}
