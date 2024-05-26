
import java.util.Stack;
    public class class5 {
        public String reverseString(String input) {
            if (input == null || input.isEmpty()) {
                System.out.println("String is empty.");
                return "";
            }
            Stack<Character> stack = new Stack<>();
            for (char ch : input.toCharArray()) {
                stack.push(ch);
            }
            StringBuilder reversed = new StringBuilder();
            while (!stack.isEmpty()) {
                reversed.append(stack.pop());
            }
            return reversed.toString();
        }
    }
}
