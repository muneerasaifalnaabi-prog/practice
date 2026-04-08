public class shiftLeft {
    public static void main(String[] args) {
        int[] nums = {6, 2, 5, 3};
        int[] arr = shiftLeft(nums);


        for (int n : arr) {
            System.out.println(n);
        }
    }

    public static int[] shiftLeft(int[] nums) {
        int[] arr = new int[nums.length];

        if (nums.length == 0)
            return arr;

        for (int i = 0; i < nums.length - 1; i++) {
            arr[i] = nums[i + 1];
        }

        arr[nums.length - 1] = nums[0];
        return arr;
    }
}
