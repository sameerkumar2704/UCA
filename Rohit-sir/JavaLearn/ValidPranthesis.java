
import java.util.Stack;

public class ValidPranthesis {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if ((c == ')' && !stack.isEmpty() && stack.peek() == '(')
                    || (c == '}' && !stack.isEmpty() && stack.peek() == '{')
                    || (c == ']' && !stack.isEmpty() && stack.peek() == '[')) {
                stack.pop();
            } else {
                return false;
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

    }
}
