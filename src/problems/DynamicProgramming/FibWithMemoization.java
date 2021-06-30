package src.problems.DynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FibWithMemoization {

    public static Integer fib(int n, Map<Integer, Integer> memo) {
         if(memo.containsKey(n)) return memo.get(n);
         if(n <= 2) return 1;
         Integer res = fib(n-1, memo)+fib(n-2, memo);
         memo.put(n, res);
         return res;
    }

    public static void main(String args[]){
        System.out.println(fib(5, new HashMap<>()));
    }
}
