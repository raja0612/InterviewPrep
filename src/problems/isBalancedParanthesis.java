package problems;

public class isBalancedParanthesis {
    static int balance = 0;
    public static boolean isBalancedParanthesis(String s) {
           for(char c : s.toCharArray()) {
               if(c == '('){
                   balance = balance + 1;
               }
               if(c == ')') {
                   balance = balance - 1;
               }
               if(balance < 0) return  false;
           }
        return balance == 0;
    }

    public static void main(String[] args) {
        System.out.println(isBalancedParanthesis("L(ee)(t(()co)d)e"));
    }
}
