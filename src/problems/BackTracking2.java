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
            backtrack(nums,i+1, tempList);
            tempList.remove(tempList.size() -1);
        }


        /* nums = [1, 2, 3]
           result = [[], [1],[1,2], [1,2,3], [1,3], [2], [2,3], [3]]

          7:00 i = 0:
               tempList = [1]
               backtrack(nums, 1, [1]) --> running

                   backtrack(nums, 1, [1])
                   i=1:
                   templist = [1,2]
                    backtrack(nums, 2, [1, 2]) --> running (done)

                        backtrack(nums, 2, [1, 2])
                       i=2:
                       templist = [1,2,3]
                        backtrack(nums, 3, [1, 2]) --> running (done)

                           backtrack(nums, 3, [1, 2, 3]) --> done

                                       backtrack(nums, 1, [1])
                   i=2:
                   templist = [1, 3]
                   backtrack(nums, 3, [1,3]) --> running (done)

          7:00 i = 1:
               tempList = [2]
               backtrack(nums, 2, [2]) --> running



           7:10
               i = 1
               tempList =[1,2]
               backtrack(nums, 2, [1, 2])
               //remove
           7:02
               i = 2
               tempList =[1,2, 3]
               backtrack(nums, 3, [1, 2, 3])
               //remove


           7:03
              i = 3
              condition false


         */



        /*


                backtracking

                subsets -> add backtrack remove
                permutations -> swap backtrack swap
                combinations -> add backtrack remove
         */

    }

    public static  void main(String args[]) {
        System.out.println(subsets(new int[]{1, 2, 3}));
    }
}
