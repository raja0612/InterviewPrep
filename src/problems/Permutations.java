package problems;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        System.out.println(backtrack(nums, 0, res, tempList));
    }

    private static  List<List<Integer>> backtrack(int[] nums, int index, List<List<Integer>> res, List<Integer> tempList ) {
        if(nums.length == index) {
            res.add(copyArray(nums));
        }

        for(int i =index; i< nums.length; i++) {
            swap(nums, i, index);
            backtrack(nums, index+1, res, tempList);
            swap(nums, i, index);
        }
        return res;
    }

    private static List<Integer> copyArray(int[] nums) {
        List<Integer> r = new ArrayList<>();
        for(int x : nums) {
            r.add(x);
        }
        return r;
    }

    private static void swap(int[] nums, int i, int index) {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }
}
