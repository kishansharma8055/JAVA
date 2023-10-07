import java.util.Scanner;

public class Decision {
    public static void main(String[] var) {
        int a;
        System.out.println("enter a number");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        if (a == 5) {
            System.out.println("value of a is 5");
        }
        obj.close();
    }
}
