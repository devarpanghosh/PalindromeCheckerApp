import java.util.LinkedList;

/**
 * ============================================================
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * ============================================================
 * * Use Case 8: Linked List Based Palindrome Checker
 * * Description:
 * This class checks whether a string is a palindrome
 * using a LinkedList.
 * * Characters are added to the list and then compared
 * by removing elements from both ends:
 * - removeFirst()
 * - removeLast()
 * * This demonstrates how LinkedList supports
 * double-ended operations for symmetric validation.
 * * @author Developer
 * @version 8.0
 */
public class PalindromeChecker {

    /**
     * Application entry point for UC8.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Define the input string
        String input = "level";

        // Create a LinkedList to store characters
        // LinkedList is ideal here as it allows O(1) removal from both ends
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Flag to track palindrome state
        boolean isPalindrome = true;

        // Compare until only one or zero elements remain
        while (list.size() > 1) {
            // Symmetry check: compare the head and the tail of the list
            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        System.out.println("Testing string: " + input);
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}