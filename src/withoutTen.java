public class withoutTen {
    public static void main(String[] args) {
        int[] nums={1,10,10,5};// 1,3,5,0
        int[] arr =withoutTen(nums);
        for (int n : arr) {
            System.out.print(n + " ");
        }

    }


    public static  int[]  withoutTen(int[] nums){
        int shiftlef = 0;
        for(int i=0; i<nums.length; i++){
            if(i+shiftlef >= nums.length){
                nums[i] = 0;
            }else{
                nums[i] = nums[i+shiftlef];
            }
            if(nums[i] == 10){
                shiftlef++;
                i-=1;
            }
        }
        return nums;
    }

    }

