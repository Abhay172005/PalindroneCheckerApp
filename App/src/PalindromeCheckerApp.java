// version 4.0
// author Abhay
// useCase 4: Character Array Based Palindrome Check

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App Management System");

        String word = "madam";

        // Convert string to char array
        char[] characters = word.toCharArray();

        int left = 0;
        int right = characters.length - 1;

        boolean isPalindrome = true;

        // Two-pointer approach
        while (left < right) {

            if (characters[left] != characters[right]) {
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
}