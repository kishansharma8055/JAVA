import java.util.Scanner;

// package C_program_in_java;

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
