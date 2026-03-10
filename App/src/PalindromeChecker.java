import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ============================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * ============================================================
 * * Use Case 7: Deque Based Optimized Palindrome Checker
 * * Description:
 * This class validates a palindrome using a Deque
 * (Double Ended Queue).
 * * Characters are inserted into the deque and then
 * compared by removing elements from both ends:
 * - removeFirst()
 * - removeLast()
 * * This avoids reversing the string and provides an
 * efficient front-to-back comparison approach.
 * * This use case demonstrates optimal bidirectional
 * traversal using Deque.
 * * @author Developer
 * @version 7.0
 */
public class PalindromeChecker {

    /**
     * Application entry point for UC7.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Define the input string
        String input = "refer";

        // Create a Deque to store characters
        // ArrayDeque is a highly efficient implementation of the Deque interface
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque
        for (char c : input.toCharArray()) {
            // We add to the end to maintain the original sequence
            deque.addLast(c);
        }

        // Flag to track palindrome result
        boolean isPalindrome = true;

        // Continue comparison while more than one element exists
        // If 0 or 1 element remains, the check is complete
        while (deque.size() > 1) {
            // Remove from both ends
            char first = deque.removeFirst();
            char last = deque.removeLast();

            // If the "ends" don't match, it's not a palindrome
            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Display the result
        System.out.println("Input: " + input);
        if (isPalindrome) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }
    }
}