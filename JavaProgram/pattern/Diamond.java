class Diamond {
    public static void main(String[] args) {
        int n = 4;
        // first half diamond
        for (int i = 1; i <= n; i++) {
            // for space
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // for star
            // int od
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // second half diamond
        for (int i = n; i >= 1; i--) {
            // for space
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // for star
            // int od
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
