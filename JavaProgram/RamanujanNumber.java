import java.util.Scanner;

class RamanujanNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        long n = scan.nextInt();
        long i, j, count = 0;
        for (i = 1; i <= n; i++) {
            for (j = 1; j < i; j++) {
                if (n == Math.pow(i, 3) + Math.pow(j, 3)) {
                    count++;
                    System.out.println(i + " " + j);
                }
            }
        }
        if (count > 0) {
            System.out.println("number is ramanujan number ");
        } else {
            System.out.println("number is not ramanujan number ");
        }
        scan.close();
    }
}

// output
// enter a number 1729
// 10 9
// 12 1
// number is ramanujan number