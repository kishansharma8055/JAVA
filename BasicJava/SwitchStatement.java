import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int a = scan.nextInt();
        switch (a) {
            case 1:
                System.out.println("you enter 1");
                break;
            case 2:
                System.out.println("you enter 2");
                break;
            case 3:
                System.out.println("you enter 3");
                break;
            case 4:
                System.out.println("you enter 4");
                break;
            default:
                System.out.println("invalid");
        }
        scan.close();
    }
}
