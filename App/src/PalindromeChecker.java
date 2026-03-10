import java.util.Stack;

/**
 * ============================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * ============================================================
 * * Use Case 5: Stack Based Palindrome Checker
 * * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 * * At this stage, the application:
 * - Pushes characters into a stack
 * - Pops them in reverse order
 * - Compares with original sequence
 * - Displays the result
 * * This maps stack behavior to reversal logic.
 * * @author Developer
 * @version 5.0
 */
public class PalindromeChecker {

    /**
     * Application entry point for UC5.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Declare and initialize the input string.
        String input = "noon";

        // Create a Stack to store characters.
        // We use the Wrapper class 'Character' because Collections don't hold primitives.
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack.
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially.
        boolean isPalindrome = true;

        // Iterate again through original string.
        for (char c : input.toCharArray()) {
            // Pop the top character from the stack.
            // Since it's LIFO, the first pop() is the last character of the string.
            char reversedChar = stack.pop();

            if (c != reversedChar) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("The word \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + input + "\" is NOT a palindrome.");
        }
    }
}