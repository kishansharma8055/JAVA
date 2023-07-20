/ // Q.1 input from user and print a search element
// import java.util.Scanner;

// class ArrayFile {
// public static void main(String[] args) {
// System.out.println("enter array size");
// Scanner scan = new Scanner(System.in);
// int size = scan.nextInt();
// int arr[] = new int[size];

// // input
// for (int i = 0; i < arr.length; i++) {
// arr[i] = scan.nextInt();
// }

// System.out.println("enter a element for find");
// int key = scan.nextInt();

// // output
// for (int j = 0; j < arr.length; j++) {
// if (arr[j] == key) {
// System.out.println(arr[j]);
// }
// }
// scan.close();

// }
// }






// // Q.2 inter a matrix and search a element
// import java.util.Scanner;

// class ArrayFile {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("enter size of 2D array");
//         int a = scan.nextInt();
//         int b = scan.nextInt();
//         System.out.println("enter a matrix");
//         int arr[][] = new int[a][b];

//         // input
//         for (int i = 0; i < a; i++) {
//             for (int j = 0; j < b; j++) {
//                 arr[i][j] = scan.nextInt();
//             }
//         }

//         // output
//         for (int i = 0; i < a; i++) {
//             for (int j = 0; j < b; j++) {
//                 System.out.print(arr[i][j]);
//             }
//             System.out.println();
//         }

//         // search
//         System.out.println("enter a element for search");
//         int key = scan.nextInt();
//         for (int i = 0; i < a; i++) {
//             for (int j = 0; j < b; j++) {
//                 if (arr[i][j] == key) {
//                     System.out.println("search element is " + arr[i][j]);
//                 }
//             }
//         }
//         scan.close();
//     }
// }