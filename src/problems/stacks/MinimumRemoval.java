package problems.stacks;

/*

   //first open and close ---> dont remove
        //abc(hbhd)

        //first close ---> remove
        //abc)hfjhjd)fnj

        //open but no closing ---> remove
        //hjfbd(jdhfbkjd(

        /*
        List removeIndexes;
        Stack s;
        for(each char){
           if(c is close && s is empty)
             Add it to removeIndexes;
             continue;

           if(c is open)
             push it to stack
           if(c is close)
             pop from stack
        }

        while(s is not empty)
           pop and push it to removeIndexes;

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinimumRemoval {

    public static String minRemoveToMakeValid(String s) {

          /*
        for char in s {

           if (current char is open or close) {

            // check if it is close paranthesis and stack is empty
              add that index to removal list

            // check if it is close paranthesis  and stack is not empty
              pop from the stack

            // else push it to the stack

          }

          // while stack is not empty add all stack indexes to removal list


          // crate new string without rempval list indexes

          // return that string



        */


        Stack<Integer> stack = new Stack<>();
        List<Integer>  indexesToBeRemoved = new ArrayList<>();

        char[] chars = s.toCharArray();


        for(int i = 0; i < chars.length;  i++) {
            char ch = chars[i];

            if(ch == '(' || ch == ')') {

                if(ch == ')' && stack.empty()) {
                    indexesToBeRemoved.add(i);
                } else if( ch == ')'){
                    stack.pop();
                } else {
                    stack.push(i);
                }
            }

        }

        while(!stack.empty()) {
            indexesToBeRemoved.add(stack.pop());
        }

        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < chars.length;  i++) {

            if(!indexesToBeRemoved.contains(i)) {
                sb.append(chars[i]+ "");
            }
        }

        return sb.toString();


    }

    public static void main(String[] args) {
        System.out.println(minRemoveToMakeValid("lee(t(c)o)de))("));
    }
}
