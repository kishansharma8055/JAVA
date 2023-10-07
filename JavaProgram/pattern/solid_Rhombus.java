//  solid rhombus

public class solid_Rhombus {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // star
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//
//
//
//
//

// Hollow Rhombus
// public class solid_Rhombus {
// public static void main(String[] args) {
// int n = 5;
// for (int i = 1; i <= n; i++) {
// // space
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }

// // star
// for (int j = 1; j <= n; j++) {
// if (i == 1 || j == 1 || i == n || j == n) {
// System.out.print("* ");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// }
