package src.problems;

import java.util.*;

public class Test {

    public static boolean test(String s) {

        // Write your code here
        if(s.length() == 0) return true;

        Map<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('(', ')');
        map.put('[', ']');

        Stack<Character> stack = new Stack();

        for(int i = 0; i < s.length();  i++) {
            Character ch = s.charAt(i);
            if(ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else {
                Character popped = stack.pop();
                System.out.println(popped);
                if(ch != map.get(popped)) {
                    return false;
                }
            }
        }
        if(stack.size() != 0) return false;
        return true;
    }
    public static  void main(String args[]) {
        System.out.println(test("{{[[(())]]}"));
    }
}
