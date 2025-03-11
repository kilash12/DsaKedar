import java.util.*;

public class IinfixToPostfix {
    // Method to get precedence of operators
    private static int precedence(char ch) {
        switch (ch) {
            case '+': case '-': return 1;
            case '*': case '/': return 2;
            case '^': return 3;
        }
        return -1;
    }

    // Method to convert infix to postfix
    public static String infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            // If operand, add to output
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            } 
            // If '(', push to stack
            else if (ch == '(') {
                stack.push(ch);
            } 
            // If ')', pop till '(' is found
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); // Remove '('
            } 
            // If operator, pop higher precedence operators from stack
            else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        // Pop remaining elements in the stack
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    // Main method for testing
    public static void main(String[] args) {
        String infix = "A+B*(C^D-E)";
        System.out.println("Infix Expression: " + infix);
        System.out.println("Postfix Expression: " + infixToPostfix(infix));
    }
}
