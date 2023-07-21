import java.util.Scanner;

// package C_program_in_java;

class FabonacciSeries {
    public static void main(String[] args) {
        int i = 0, j, k = 0, n, sum = 0;
        System.out.println("enter a limit of fabonacci series");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        j = k + 1;
        while (k <= n) {
            System.out.println(j + " ");
            sum = i + j;
            i = j;
            j = sum;
            k++;
        }
        scan.close();
    }
}