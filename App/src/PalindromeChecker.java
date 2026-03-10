/**
 * ============================================================
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * ============================================================
 * * Use Case 2: Hardcoded Palindrome Validation
 * * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 * * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 * * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 * * @author Developer
 * @version 2.0
 */
public class PalindromeChecker {

    /**
     * Application entry point for UC2.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Step 1: Hardcoded string literal
        String input = "madam";

        // Step 2: Boolean flag to track if it's a palindrome
        boolean isPalindrome = true;

        // Step 3: Logic to check palindrome
        // Loop only till half of the string length as per the hint
        for (int i = 0; i < input.length() / 2; i++) {
            // Compare character at index i with character at matching index from the end
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break; // Exit loop early if a mismatch is found
            }
        }

        // Step 4: Conditional Statement to print the result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }
    }
}