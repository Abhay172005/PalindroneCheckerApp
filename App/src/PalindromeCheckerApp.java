
// version 1.0
// author Abhay
// useCase 1: Welcome page

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App Management System");

        String word = "madam";  // Hardcoded string

        boolean isPalindrome = true;

        for (int i = 0; i < word.length() / 2; i++) {

            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
}