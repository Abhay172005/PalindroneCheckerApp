// version 6.0
// author Abhay
// useCase 6: Queue + Stack Based Palindrome Check

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App Management System");

        String word = "madam";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Push into stack and enqueue into queue
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            stack.push(ch);       // LIFO
            queue.add(ch);        // FIFO
        }

        boolean isPalindrome = true;

        // Compare pop (stack) vs remove (queue)
        for (int i = 0; i < word.length(); i++) {

            char stackChar = stack.pop();
            char queueChar = queue.remove();

            if (stackChar != queueChar) {
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