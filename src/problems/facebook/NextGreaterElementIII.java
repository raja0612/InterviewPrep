package problems.facebook;
//https://leetcode.com/problems/next-greater-element-iii/

    /*
    Procedure:
            Starting from the rightmost digit, going to left. Find the first digit which is smaller than the previous digit.
            In this example 124651, 4 is smaller than 6. Remember 4 and its index 2.
            Going from rightmost again - this time, find the first digit which is bigger than 4. It is 5 here 124651.
            Swap 4 and 5. The number becomes 125641.
            Reverse all the digits which are right to 4's original index (That is 2), 641 should be reversed to 146 here.
            And the answer is reached which is 125146.
     */

public class NextGreaterElementIII {

    public static int findNextGraterElement(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        int firstDecreasingDigitIndex = getFirstDecreasingDigitIndex(digits);

        if (firstDecreasingDigitIndex == -1) return -1;

        int firstGreaterDigitsIndex = getFirstGreaterDigitIndex(digits, firstDecreasingDigitIndex);
        swap(digits, firstDecreasingDigitIndex, firstGreaterDigitsIndex);
        reverse(digits, firstDecreasingDigitIndex + 1, digits.length - 1);

        return Long.parseLong(new String(digits)) > Integer.MAX_VALUE ? -1 : Integer.parseInt(new String(digits));
    }

    private static void reverse(char[] digits, int start, int end) {
        while (start < end) {
            swap(digits, start, end);
            start++;
            end--;
        }
    }

    private static void swap(char[] digits, int i, int j) {
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
    }

    private static int getFirstGreaterDigitIndex(char[] digits, int firstDecreasingDigitIndex) {
        for (int i = digits.length - 1; i > firstDecreasingDigitIndex; i--) {
            if (digits[i] > digits[firstDecreasingDigitIndex]) {
                return i;
            }
        }
        return -1;
    }

    private static int getFirstDecreasingDigitIndex(char[] digits) {
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i - 1] < digits[i]) {
                return i - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a = 124651;
        System.out.println("Result....." + findNextGraterElement(a));
            /*
    Algorithm n = 124651

    1. Start from end to start and find element index which is smaller than previous one. here 4 (4 < 6 index=2)
    2. start from end again to above index (2) to find first element index which is greater than 4
       so 5 ( 4 < 5, index=4)
    3. then. swap 4 and 5 . result string 125641
    4. reverse elements from index = 2 + 1 to last (641)
    5. 125146

    Time complexity O(N) max linear traversal of digits
    Space Complexity O(N) char array to store number of digits

    here is N is the number fo digits




    */
    }
}
