import java.util.Scanner;

// Q.1 factorial
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


// Q.2 Geometric 
public class Geometric {
    public static void main(String[] args) {
        int a, b = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Number");
        a = obj.nextInt();
        while (b == a) {
            Double result = Math.pow(b, a); // power function kya hoga
            System.out.println(result);
            ++b;
        }

        obj.close();
    }
}

