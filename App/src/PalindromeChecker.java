import java.util.Scanner;

/**
 * ============================================================
 * UTILITY CLASS - PalindromeUtils
 * ============================================================
 * Contains reusable logic for palindrome validation.
 */
class PalindromeUtils {

    /**
     * Basic validation for single words.
     * @param text The string to check.
     * @return true if palindrome.
     */
    public boolean isPalindrome(String text) {
        String cleaned = text.toLowerCase();
        int start = 0;
        int end = cleaned.length() - 1;

        while (start < end) {
            if (cleaned.charAt(start) != cleaned.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    /**
     * Overloaded method for sentence validation with a flag.
     * @param text The sentence to check.
     * @param ignoreSpecialChars flag to strip punctuation.
     * @return true if palindrome.
     */
    public boolean isPalindrome(String text, boolean ignoreSpecialChars) {
        if (ignoreSpecialChars) {
            // Use regex to keep only alphanumeric characters
            text = text.replaceAll("[^a-zA-Z0-9]", "");
        }
        return isPalindrome(text); // Reuse the basic logic
    }
}

/**
 * ============================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * ============================================================
 * * Use Case 12: Object-Oriented Palindrome Checker
 * * Description:
 * This class uses an external utility class and method
 * overloading to handle different validation types.
 */
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeUtils utils = new PalindromeUtils();

        System.out.println("--- OOP Palindrome Checker ---");
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        // Demonstrate Overloading
        System.out.println("Result (Strict): " + utils.isPalindrome(input));
        System.out.println("Result (Ignore Special Chars): " + utils.isPalindrome(input, true));

        scanner.close();
    }
}