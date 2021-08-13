package problems.facebook;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargestNumber {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 1, 2};
        Arrays.sort(Arrays.stream( arr ).boxed().toArray( Integer[]::new ), Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

         // 54321
         int temp = arr[arr.length-1]; // 1
         arr[arr.length-1] = arr[arr.length-2];
         arr[arr.length-2] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
