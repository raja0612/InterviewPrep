package src.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Factorial {

    public static int fact(int n) {
        if( n <= 0)  return  1;
        return n * fact(n-1);
    }

    public static void main(String args[]) {
       String digit = "23";

       int currentIndex;
       List<String> currentList = new ArrayList<>();

       Map<Character, String> map = new HashMap<>();

       map.put('2', "abc");
        map.put('3', "def");



       for(char ch: digit.toCharArray()) {
           String temp = map.get(ch);

            for(char ch2: temp.toCharArray()) {
                currentList.add(ch2+"");
            }

       }

    }
}
