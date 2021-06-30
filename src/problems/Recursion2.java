package src.problems;

import java.util.ArrayList;
import java.util.List;

public class Recursion2 {

    static List<String> result = new ArrayList<>();

    public static List<String> myRec(int[] nums) {

        for(int i : nums) {
            result.add(util(i));
        }

        return result;
    }

    private static String util(int n) {
        switch (n) {
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            default: return "Not a number";
        }

    }

    public static void main(String args[]) {
        System.out.println(myRec(new int[]{1, 2, 3, 4, 5}));
    }
}
