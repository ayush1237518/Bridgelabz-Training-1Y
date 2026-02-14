
package com.gla.methods;

public class PalindromeChecker {

    String text;

    boolean isPalindrome() {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    void display() {
        if (isPalindrome())
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    public static void main(String[] args) {

        PalindromeChecker p = new PalindromeChecker();
        p.text = "madam";

        p.display();
    }
}
