// swap two number without use a third variable and pointer use only XOR gate
public class Swap {
    public static String swapTwoNumber(int a, int b) {
        String swap = "no swap to be found";
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        swap = a + " " + b;
        return swap;
    }
}

class MainClass {
    public static void main(String var[]) {
        String result = Swap.swapTwoNumber(2, 3);
        System.out.println(result);
    }
}