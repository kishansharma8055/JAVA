import java.util.ArrayDeque;
import java.util.Deque;

public class ParenthesesCheck {
    public static void main(String[] args) {
        String str = "([{]})";
        Solution obj = new Solution();
        boolean a = obj.isValid(str);
        System.out.println(a);
    }
}

class Solution {

    boolean isValid(String expr) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }

}