// 1. call by reference
// class CallByReference {
//     int n = 10;

//     void fun(CallByReference obj) {
//         obj.n = obj.n + 5;
//     }
// }

// class Referencekk {
//     public static void main(String[] var) {
//         CallByReference obj = new CallByReference();
//         System.out.println(obj.n);
//         obj.fun(obj);
//         System.out.println(obj.n);

//     }
// }

// 2. call by value
class CallByValue {
    int n = 10;

    void fun(int x) {
        x = x + 5;
    }
}

class Valuekk {
    public static void main(String[] var) {
        CallByValue obj = new CallByValue();
        System.out.println(obj.n);
        obj.fun(obj.n);
        System.out.println(obj.n);

    }
}