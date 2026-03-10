import java.util.Scanner;

/**
 * ============================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * ============================================================
 * * Use Case 11: Recursive Palindrome Validation
 * * Description:
 * This class validates a palindrome using a recursive
 * approach instead of traditional loops.
 * * At this stage, the application:
 * - Breaks the problem into smaller sub-problems
 * - Defines a base case (string length 0 or 1)
 * - Uses recursive calls for character comparison
 * - Returns the final boolean result
 * * This demonstrates functional programming logic.
 * * @author Developer
 * @version 11.0
 */
public class PalindromeChecker {

    /**
     * Application entry point for UC11.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Recursive Palindrome Checker ---");
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        // Call the recursive helper method
        if (isPalindrome(input)) {
            System.out.println("Result: \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }

    /**
     * Recursive method to check for palindrome.
     * * @param str The string to check
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindrome(String str) {
        // Base Case 1: If string is empty or has 1 char, it's a palindrome
        if (str.length() <= 1) {
            return true;
        }

        // Recursive Step: Compare first and last characters
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            // If they match, check the substring excluding the first and last chars
            return isPalindrome(str.substring(1, str.length() - 1));
        }

        // If characters don't match, it's not a palindrome
        return false;
    }
}