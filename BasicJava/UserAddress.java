import java.util.Scanner;

public class UserAddress {
    public static void main(String args[]) {
        String address, dis, state;
        int pin;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter address : ");
        address = obj.nextLine();
        System.out.println("enter Distric : ");
        dis = obj.nextLine();
        System.out.println("enter state : ");
        state = obj.nextLine();
        System.out.println("enter pin code : ");
        pin = obj.nextInt();
        System.out.println(address + " " + dis + " " + state + " " + pin);

    }
}
