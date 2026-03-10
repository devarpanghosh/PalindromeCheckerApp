import java.util.Scanner;

/**
 * ============================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * ============================================================
 * * Use Case 10: Sentence Based Palindrome Check
 * * Description:
 * This class validates whether a sentence is a palindrome
 * by ignoring spaces, punctuation, and case sensitivity.
 * * At this stage, the application:
 * - Uses Regular Expressions (Regex) for cleaning
 * - Normalizes the string (lowercase)
 * - Uses StringBuilder for efficient reversal
 * - Compares the processed results
 * * This demonstrates real-world text processing.
 * * @author Developer
 * @version 10.0
 */
public class PalindromeChecker {

    /**
     * Application entry point for UC10.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Sentence Palindrome Checker ---");
        System.out.print("Enter a phrase (e.g., 'A man, a plan, a canal: Panama'): ");
        String original = scanner.nextLine();

        // Step 1: Data Cleaning (Normalization)
        // [^a-zA-Z0-9] is a regex that matches anything that is NOT a letter or number
        String cleaned = original.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Efficient Reversal using StringBuilder
        StringBuilder sb = new StringBuilder(cleaned);
        String reversed = sb.reverse().toString();

        // Step 3: Comparison and Output
        System.out.println("\nProcessed String: " + cleaned);

        if (!cleaned.isEmpty() && cleaned.equals(reversed)) {
            System.out.println("Result: It is a Palindrome sentence!");
        } else {
            System.out.println("Result: It is NOT a Palindrome sentence.");
        }

        scanner.close();
    }
}