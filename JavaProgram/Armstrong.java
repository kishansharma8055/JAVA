import java.util.Scanner;

// the armstrong number is 0,1,153,370,371,407
// 1^3 +  5^3 + 3^3 = 153

class Armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int n = scan.nextInt();
        int r, sum = 0, count = 0, m = n;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        n = m;
        while (n > 0) {
            r = n % 10;
            if (count > 0) {
                sum = sum + (r * r * r);
                count--;
            }
            n = n / 10;
        }
        if (m == sum) {
            System.out.println("armstrong");
        } else {
            System.out.println("not armstrong");
        }
        scan.close();
    }
}
