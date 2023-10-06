import java.util.Scanner;

class Palindrome {

    public static boolean checkPalindrome(int a) {
        int r, sum = 0, temp;
        temp = a;
        while (a > 0) {
            r = a % 10;
            sum = sum * 10 + r;
            a = a / 10;
        }
        if (temp == sum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (checkPalindrome(a)) {
            System.out.println("this is palindrome");
        } else {
            System.out.println("this is not palindrome");
        }
        scan.close();
    }
}