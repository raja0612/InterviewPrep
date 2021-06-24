package src.problems;

public class Palindrome {

    static boolean isPalindrome(String s) {

        int start = 0;
        int end = s.length() - 1;
        while(start < end) {
            if(s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }

    public static  void main(String args[]) {
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("a"));
        System.out.println(isPalindrome("abcba"));
        System.out.println(isPalindrome("acb"));
        System.out.println(isPalindrome("abcdedcba"));
        System.out.println(isPalindrome("abcdefghijklmnopqrstuvwxyzazyxwvutsrqponmlkjihgfedcba"));
    }
}
