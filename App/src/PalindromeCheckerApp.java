// version 3.0
// author Abhay
// useCase 3: Palindrome using String Reverse

public class PalindromeCheckerApp {   // UC3 update

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App Management System");

        String original = "madam";
        String reversed = "";

        // Reverse string using loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
    }
}