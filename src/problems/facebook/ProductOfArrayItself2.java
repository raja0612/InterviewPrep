package problems.facebook;

public class ProductOfArrayItself2 {

    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4};

        int left[] = new int[nums.length];

        left[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i];
        }

        int rightSideProduct = 1;

        for (int i = nums.length - 1; i > 0; i--) {
            left[i] = left[i - 1] * rightSideProduct;
            rightSideProduct = rightSideProduct * nums[i];
        }
        left[0] = rightSideProduct;
        for (int x : left) {
            System.out.print(x + " ");
        }
    }


}
