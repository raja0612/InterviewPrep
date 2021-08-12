package problems.facebook;

public class ProductOfArrayItself {

    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4};
        System.out.print("original array \n");
        for (int x : nums) {
            System.out.print(x + " ");
        }
        System.out.println("");
        System.out.println("left multiply");
        int[] left = new int[nums.length];

        left[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i];
        }
        for (int x : left) {
            System.out.print(x + " ");
        }

        int[] right = new int[nums.length];
        right[nums.length - 1] = nums[nums.length - 1];
        System.out.println();
        System.out.println("right multiply");

        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i];
        }
        for (int x : right) {
            System.out.print(x + " ");
        }

        int finalRes[] = new int[nums.length];
        finalRes[0] = right[1];
        finalRes[nums.length - 1] = left[nums.length - 2];

        for (int i = 1; i < nums.length - 1; i++) {
            finalRes[i] = left[i - 1] * right[i + 1];
        }

        System.out.println();
        System.out.println("final output");
        for (int x : finalRes) {
            System.out.print(x + " ");
        }
    }
}
