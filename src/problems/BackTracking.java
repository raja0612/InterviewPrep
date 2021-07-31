package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BackTracking {

    static List<List<Integer>> result = new ArrayList<>();

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, 0, new ArrayList<>());
        return result;
    }

    private static void backtrack(int[] candidates, int target, int start,
                           int sum, List<Integer> tempList){

        if(sum > target) return;

        if(sum == target) {
            result.add(new ArrayList(tempList));
        }

        for(int i = start; i< candidates.length; i++) {
                tempList.add(candidates[i]);
                backtrack(candidates, target, i + 1, sum+candidates[i], tempList);
                tempList.remove(tempList.size() - 1);
        }

    }

    public static void main(String args[]) {
        System.out.println(combinationSum2(new int[]{1,2,3, 3}, 6));
    }
}


