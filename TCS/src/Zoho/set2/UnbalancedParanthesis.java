package Zoho.set2;

import java.util.Stack;

public class UnbalancedParanthesis {
    public static void main(String[] args) {
        String input = ")(abc)def)(";
        String result = removeUnbalancedParentheses(input);
        System.out.println(result);  // Output: ((abc)(de))
    }

    public static String removeUnbalancedParentheses(String input) {
        Stack<Integer> stack = new Stack<>();
        boolean[] remove = new boolean[input.length()];

        // First pass to find all the unmatched closing parentheses
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '(') {
                stack.push(i);  // Track the index of opening parentheses
            } else if (ch == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();  // We found a matching opening parenthesis
                } else {
                    remove[i] = true;  // Mark this closing parenthesis for removal
                }
            }
        }

        // Mark the unmatched opening parentheses for removal
        while (!stack.isEmpty()) {
            remove[stack.pop()] = true;  // Remove unmatched opening parentheses
        }

        // Build the result string by skipping the unmatched parentheses
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (!remove[i]) {
                result.append(input.charAt(i));  // Append non-removed characters
            }
        }
        return result.toString();
    }
}


/*
Input  : ((abc)((de))
         Output : ((abc)(de))

         Input  : (((ab)
         Output : (ab)
 */
