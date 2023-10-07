// package loops;

class ForLoop {
    public static void main(String[] args) {
        for (int a = 1; a < 7; a++) {
            System.out.println("hello");
            if (a == 3) {
                System.out.println("continue");
                continue;
            }
            if (a == 2) {
                System.out.println("break");
                break;
            }
        }
    }
}
