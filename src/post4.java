public class post4 {
    public static void main(String[] args) {
        int[] nums={2,4,1,2};
        int[] arr =post4(nums);
        for (int n : arr) {
            System.out.print(n + " ");
        }

    }
    public static int[] post4(int[] nums) {

            int lastIndex = -1;


            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 4) {
                    lastIndex = i;
                }
            }


            int[] arr = new int[nums.length - lastIndex - 1];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = nums[lastIndex + 1+i];}


        return arr;
    }
}
