package problems.Recurssion;

import java.util.HashSet;
import java.util.Set;

public class Factorial {

    public static int factorial(int n) {
        //base case to terminate recursion
        if( n <= 1) return 1;
        return n * factorial(n-1); // calling factorial() recursiovely with different input
    }

    public static void fact(int n) {
        int result = 1;
        for(int i = 1;  i <= n; i++) {
            result = result * i;
        }
        System.out.println(result);

        Set<String> hash_Set = new HashSet<String>();
        hash_Set.add("");
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));

        fact(5);
    }
}
