public class bigDif {
    public static void main(String[] args) {
        int[] arr={10,3,5,6};
        System.out.println(bigDif(arr));

    }
    public static int  bigDif(int[] nums) {
        int max = nums[0];
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }

            if (nums[i] < min) {
                min = nums[i];
            }
        }

        return max - min;
    }
}