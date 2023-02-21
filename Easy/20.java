import java.util.Stack;

class Solution {
    public static boolean isValid(String s) {

        if (s.length() % 2 != 0)
            return false;

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }

            System.out.println(stack);
        }

        return stack.isEmpty();

    }

    public static void main(String[] args) {
        System.out.println(isValid("{{()}}{{"));
    }

}