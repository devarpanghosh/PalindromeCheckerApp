import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * ============================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * ============================================================
 * * Use Case 6: Queue + Stack Fairness Check
 * * Description:
 * This class demonstrates palindrome validation using
 * two different data structures:
 * - Queue (FIFO - First In First Out)
 * - Stack (LIFO - Last In First Out)
 * * Characters are inserted into both structures and then
 * compared by removing from the front of the queue and
 * the top of the stack.
 * * If all characters match, the input string is confirmed
 * as a palindrome.
 * * This use case helps understand how FIFO and LIFO
 * behaviors can be combined for symmetric comparison.
 * * @author Developer
 * @version 6.0
 */
public class PalindromeChecker {

    /**
     * Application entry point for UC6.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Define the input string to validate
        String input = "civic";

        // Create a Queue to store characters in FIFO order
        // In Java, Queue is an interface, usually implemented by LinkedList
        Queue<Character> queue = new LinkedList<>();

        // Create a Stack to store characters in LIFO order
        Stack<Character> stack = new Stack<>();

        // Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);  // Enqueue
            stack.push(c); // Push
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare characters until the queue becomes empty
        while (!queue.isEmpty()) {
            // Dequeue from front (Original order)
            char fromQueue = queue.remove();
            // Pop from top (Reversed order)
            char fromStack = stack.pop();

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Display the result
        System.out.println("Input: " + input);
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}