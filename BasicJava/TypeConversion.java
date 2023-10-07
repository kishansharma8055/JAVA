// Explicit conversion
// byte<-short<-int<-long<-float<-double
// public class TypeConversion {
//     public static void main(String[] args) {
//         int a = 5;
//         float b = 2.5f;
//         int sum = a + (int) b;
//         System.out.println(sum);
//     }
// }

// Implicit conversion
// byte->short->int->long->float->double
public class TypeConversion {
    public static void main(String[] args) {
        int a = 5;
        long b = 20;
        long sum = a + b;
        System.out.println(sum);
    }
}