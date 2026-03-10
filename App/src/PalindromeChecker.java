/**
 * ============================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * ============================================================
 * * Use Case 3: Reverse String Based Palindrome Check
 * * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 * * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 * * This introduces transformation-based validation.
 * * @author Developer
 * @version 3.0
 */
public class PalindromeChecker {

    /**
     * Application entry point for UC3.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Step 1: Define the original string
        String input = "radar";
        String reversed = "";

        // Step 2: Reverse the string using a loop
        // Iterate from the last character to the first
        for (int i = input.length() - 1; i >= 0; i--) {
            // String Concatenation (+) builds the reversed string character by character
            reversed = reversed + input.charAt(i);
        }

        // Step 3: Compare original and reversed using .equals()
        // Note: We use .equals() to compare content, not '==' which compares memory address
        if (input.equals(reversed)) {
            System.out.println("Original: " + input);
            System.out.println("Reversed: " + reversed);
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Original: " + input);
            System.out.println("Reversed: " + reversed);
            System.out.println("Result: It is NOT a Palindrome.");
        }
    }
}