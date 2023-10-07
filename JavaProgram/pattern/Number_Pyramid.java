// // inverted Half pyramid with number
// public class Number_Pyramid {
// public static void main(String[] args) {
// int n = 4;

// // outer loop
// for (int i = 1; i <= n; i++) {

// // inner loop
// for (int j = 1; j <= i; j++) {
// System.out.print(j + " ");
// }

// System.out.println();
// }
// }
// }

//
//
//
//
//

// // inverted Half pyramid with number with 180 degree
// public class Number_Pyramid {
// public static void main(String[] args) {
// int n = 4;

// // outer loop
// for (int i = n; i >= 1; i--) {

// // inner loop
// for (int j = 1; j <= i; j++) {
// System.out.print(j + " ");
// }

// System.out.println();
// }
// }
// }

//
//
//
//
//

// // inverted Half pyramid with number with 180 degree
// public class Number_Pyramid {
// public static void main(String[] args) {
// int n = 4;

// // outer loop
// for (int i = 1; i <= n; i++) {

// // inner loop
// for (int j = 1; j <= n - i + 1; j++) {
// System.out.print(j + " ");
// }

// System.out.println();
// }
// }
// }

//
//
//
//
//

// // Floyd's Triangle
// public class Number_Pyramid {
// public static void main(String[] args) {
// int n = 5, count = 1;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(count + " ");
// count++;
// }
// System.out.println();
// }
// }
// }

//
//
//
//
//

// // 0-1 Triangle
// public class Number_Pyramid {
// public static void main(String[] args) {
// int n = 5;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// int sum = i + j;
// if (sum % 2 == 0) {
// System.out.print("1 ");
// } else {
// System.out.print("0 ");
// }
// }
// System.out.println();
// }
// }
// }

//
//
//
//
//

// // number pyramid
// public class Number_Pyramid {
// public static void main(String[] args) {
// int n = 5;
// for (int i = 1; i <= n; i++) {
// // for space
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }

// // for number
// for (int j = 1; j <= i; j++) {
// System.out.print(i + " ");
// }

// System.out.println();
// }
// }
// }

//
//
//
//
//

// palindromic pattern
public class Number_Pyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // for space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // for number
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

    }
}