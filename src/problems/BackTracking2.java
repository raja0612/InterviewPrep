package src.problems;

import java.util.ArrayList;
import java.util.List;

public class BackTracking2 {

    static List<List<Integer>> result = new ArrayList<>();

    public static List<List<Integer>> subsets(int[] nums) {

        backtrack(nums, 0, new ArrayList<Integer>());
        return result;
    }

    static void backtrack(int[] nums, int start, List<Integer> tempList){

        result.add(new ArrayList<>(tempList));

        for(int i = start;  i < nums.length; i++) {
            tempList.add(nums[i]);
            System.out.println("before"+tempList);
            backtrack(nums,i+1, tempList);
            tempList.remove(tempList.size() -1);
            System.out.println("after"+tempList);
        }

    }

    public static  void main(String args[]) {
        System.out.println(subsets(new int[]{1, 2, 3}));
    }
}
