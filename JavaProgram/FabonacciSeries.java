import java.util.Scanner;

class FabonacciSeries {
    public static void main(String[] args) {
        int i = 0, j = 0, k = 0, n, sum = 0;
        System.out.println("enter a limit of fabonacci series");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        j = k + 1;
        while (k < (n - 1)) {
            // System.out.println(j + " ");
            sum = i + j;
            i = j;
            j = sum;
            k++;
        }
        System.out.println(j);
        scan.close();
    }
}