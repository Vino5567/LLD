package Zoho.set2;

import java.util.Stack;

public class ValidOperand {
    public static void main(String[] args) {
        System.out.println(isValidExpression("(a+b)(a*b)"));   // Valid
        System.out.println(isValidExpression("(ab)(ab+)"));    // Invalid
        System.out.println(isValidExpression("((a+b)"));       // Invalid
        System.out.println(isValidExpression("a+*b"));         // Invalid
        System.out.println(isValidExpression("a+(b*c)"));
    }

    public static String isValidExpression(String expr) {
        // Step 1: Check for valid characters
        if (!expr.matches("[a-z+\\-*/()]*")) {
            return "Invalid";
        }

        // Step 2: Check for balanced parentheses
        Stack<Character> stack = new Stack<>();
        for (char ch : expr.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) return "Invalid";
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return "Invalid";

        // Step 3: Token-level validation
        char prev = 0;
        for (int i = 0; i < expr.length(); i++) {
            char curr = expr.charAt(i);

            if (isOperator(curr)) {
                if (i == 0 || i == expr.length() - 1) return "Invalid"; // can't start or end with operator
                if (isOperator(prev) || prev == '(') return "Invalid";  // no two operators or operator after '('
            }

            if (curr == ')') {
                if (isOperator(prev) || prev == '(') return "Invalid"; // invalid closing
            }

            if (curr == '(') {
                if (Character.isLetter(prev) || prev == ')') return "Invalid"; // missing operator
            }

            prev = curr;
        }

        return "Valid";
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }
}


/*
 Eg.) Input  : (a+b)(a*b)
         Output : Valid

         Input  : (ab)(ab+)
         Output : Invalid

         Input  : ((a+b)
         Output : Invalid
 */
