// import java.util.Scanner;

// public class ArrayFile {
// public static void main(String[] args) {
// int[] arr = { 1, 2, 3, 5, 6, 2 };
// for (int var : arr)
// System.out.println(var);

// int[] arr2 = new int[5];
// arr2[0] = 10;
// arr2[1] = 20;
// arr2[2] = 30;
// for (int var : arr2)
// System.out.println(var);

// int[] arr3;
// arr3 = new int[10];
// arr3[0] = 4;
// arr3[2] = 5;
// arr3[4] = 6;
// for (int var : arr3)
// System.out.println(var);
// }
// }

//
//
//
//
//
//
//

// // 2-D Array
// class ArrayFile {
// public static void main(String[] args) {
// int[][] arr = new int[3][3];
// arr[0][0] = 1;
// arr[0][2] = 2;
// arr[1][1] = 3;
// arr[2][0] = 4;
// arr[2][2] = 5;
// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr.length; j++) {
// System.out.print(arr[i][j] + " ");
// }
// System.out.println();
// }

// int[][] arr2 = { { 1, 0, 2 }, { 0, 3, 0 }, { 4, 0, 5 } };
// for (int i = 0; i < arr2.length; i++) {
// for (int j = 0; j < arr2.length; j++) {
// System.out.print(arr2[i][j] + " ");
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
//
//

// // Question
// // Q.1 input from user and print a search element
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

//
//
//
//
//
//
//

// Q.2 inter a matrix and search a element
import java.util.Scanner;

class ArrayFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter size of 2D array");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("enter a matrix");
        int arr[][] = new int[a][b];

        // input
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        // output
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        // search
        System.out.println("enter a element for search");
        int key = scan.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (arr[i][j] == key) {
                    System.out.println("search element is " + arr[i][j]);
                }
            }
        }
        scan.close();
    }
}