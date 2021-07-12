package src.problems;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static List<List<Integer>> subsets(int[] a) {
        List<List<Integer>> res = new ArrayList<>();
        util(a, 0, res, new ArrayList<>());
        return res;
    }

    public static void util(int[] a, int start, List<List<Integer>> res, List<Integer> tempList){
        res.add(new ArrayList(tempList));
        for(int i = start; i < a.length; i++) {
            tempList.add(a[i]);
            util(a, i+1, res, tempList);
            tempList.remove((tempList.size()-1));
        }
    }

    public  static  void main(String args[]) {
        int[] a = {1, 2, 3};

        System.out.println(subsets(a));


    }
}
