//
//
// when given single number
//
//
// public class Butterfly {
// public static void main(String[] args) {
// int n = 4, m = 8;

// // first Half butterfly start
// // outer loop
// for (int i = 1; i <= 4; i++) {
// // inner loop for first star
// for (int j = 1; j <= i; j++) {
// System.out.print("* ");
// }

// // inner loop for space
// for (int j = i + 1; j <= m - i; j++) {
// System.out.print(" ");
// }

// // inner loop for second star
// for (int j = m - i + 1; j <= m; j++) {
// System.out.print("* ");
// }

// System.out.println();
// }
// // first Half butterfly end

// // second Half butterfly start
// // outer loop
// for (int i = n; i >= 1; i--) {
// // inner loop for first star
// for (int j = 1; j <= i; j++) {
// System.out.print("* ");
// }

// // inner loop for space
// for (int j = i + 1; j <= m - i; j++) {
// System.out.print(" ");
// }

// // inner loop for second star
// for (int j = m - i + 1; j <= m; j++) {
// System.out.print("* ");
// }

// System.out.println();
// }
// // second Half butterfly end
// }
// }

//
//
//
//
//

// when given two number
//
//
// public class Butterfly {
// public static void main(String[] args) {
// int n = 5;

// // first Half butterfly start
// // outer loop
// for (int i = 1; i <= n; i++) {
// // inner loop for first star
// for (int j = 1; j <= i; j++) {
// System.out.print("* ");
// }

// // inner loop for space
// int space = 2 * (n - i);
// for (int j = 1; j <= space; j++) {
// System.out.print(" ");
// }

// // inner loop for second star
// for (int j = 1; j <= i; j++) {
// System.out.print("* ");
// }

// System.out.println();
// }
// // first Half butterfly end

// // second Half butterfly start
// // outer loop
// for (int i = n; i >= 1; i--) {
// // inner loop for first star
// for (int j = 1; j <= i; j++) {
// System.out.print("* ");
// }

// // inner loop for space
// int space = 2 * (n - i);
// for (int j = 1; j <= space; j++) {
// System.out.print(" ");
// }

// // inner loop for second star
// for (int j = 1; j <= i; j++) {
// System.out.print("* ");
// }

// System.out.println();
// }
// // second Half butterfly end
// }
// }
