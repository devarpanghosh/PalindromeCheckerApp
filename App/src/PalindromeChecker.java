import java.util.Scanner;
import java.util.Stack;

/**
 * ============================================================
 * MAIN CLASS - UseCase9PalindromeCheckerApp
 * ============================================================
 * * Use Case 9: Menu-Driven Palindrome Checker
 * * Description:
 * This class provides a menu-driven interface for
 * palindrome validation.
 * * At this stage, the application:
 * - Accepts user input via Scanner
 * - Provides multiple validation options
 * - Implements logic for different techniques
 * - Displays results based on user choice
 * * This introduces interactive application design.
 * * @author Developer
 * @version 9.0
 */
public class PalindromeChecker {

    /**
     * Application entry point for UC9.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Palindrome Checker Menu ---");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        System.out.println("\nSelect Validation Technique:");
        System.out.println("1. Basic Loop (Half-Length)");
        System.out.println("2. String Reversal");
        System.out.println("3. Stack-Based (LIFO)");
        System.out.print("Enter your choice (1-3): ");

        int choice = scanner.nextInt();
        boolean isPalindrome = false;

        // Switch statement to handle different algorithmic choices
        switch (choice) {
            case 1:
                // Option 1: Basic Loop Optimization
                isPalindrome = true;
                for (int i = 0; i < input.length() / 2; i++) {
                    if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                        isPalindrome = false;
                        break;
                    }
                }
                System.out.println("Method Used: Basic Loop");
                break;

            case 2:
                // Option 2: String Reversal
                String reversed = "";
                for (int i = input.length() - 1; i >= 0; i--) {
                    reversed += input.charAt(i);
                }
                isPalindrome = input.equalsIgnoreCase(reversed);
                System.out.println("Method Used: String Reversal");
                break;

            case 3:
                // Option 3: Stack-Based
                Stack<Character> stack = new Stack<>();
                for (char c : input.toCharArray()) {
                    stack.push(c);
                }
                isPalindrome = true;
                for (char c : input.toCharArray()) {
                    if (c != stack.pop()) {
                        isPalindrome = false;
                        break;
                    }
                }
                System.out.println("Method Used: Stack (LIFO)");
                break;

            default:
                System.out.println("Invalid choice. Defaulting to Basic Loop.");
                // Default logic...
                break;
        }

        // Final result display
        System.out.println("\nInput: " + input);
        if (isPalindrome) {
            System.out.println("Result: Success! It's a palindrome.");
        } else {
            System.out.println("Result: Failure! It's NOT a palindrome.");
        }

        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}