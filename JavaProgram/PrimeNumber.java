import java.util.Scanner;

// Q.1  PrimeNumber
class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 2;
        while (i < n) {
            if (n % i == 0) {
                // System.out.println("enter number not prime" + i);
                break;
            }
            i++;
        }
        if (n == i) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        scan.close();
    }
}


// Q.2 PrimeNumber
public class Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a end range to find a priime number");
        int n = scan.nextInt();
        int i = 2, j = 2;
        for (i = 2; i <= n; i++) {
            for (j = 2; j <= i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.println(i);
            }
        }
        scan.close();
    }
}

