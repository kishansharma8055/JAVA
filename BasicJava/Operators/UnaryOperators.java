class UnaryOPerators {
    public static void main(String args[]) {
        int a = 4, b = 8;
        boolean isTrue = true;
        System.out.println(a++ + " " + ++a);
        System.out.println(b-- + " " + --b);
        System.out.println(!isTrue + " " + ~a);
    }
}