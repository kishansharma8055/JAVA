// create a stack using collaction framwork

// import java.util.Stack;

// class StackDynamically {
//     public static void main(String[] args) {
//         Stack<Integer> ss = new Stack<>();
//         ss.push(1);
//         ss.push(2);
//         ss.push(3);
//         ss.push(4);
//         System.out.println(ss);
//         ss.remove(ss.size() - 1);
//         System.out.println(ss);
//     }
// }






// it is recommended to use ArrayDeque for stack implementation as it is more efficient in a single threaded environment.
import java.util.*;

class StackDynamically {
    public static void main(String[] args) {
        Deque<Integer> ss = new ArrayDeque<>();
        ss.push(1);
        ss.push(2);
        ss.push(3);
        ss.push(4);
        System.out.println(ss);
        ss.remove(ss.size() - 1);
        System.out.println(ss);
    }
}
