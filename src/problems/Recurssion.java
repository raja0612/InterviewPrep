package src.problems;

public class Recurssion {

    public static void print(int n) {
        if( n == 6) return;
        System.out.println(n+"Im start");
        print(n+1);
        System.out.println(n+"Im Done");
    }

    public  static void main(String args[]) {
        print(1);
    }
}
