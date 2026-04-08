public class sum28 {
    public static void main(String[] args) {
        int[] arr ={2,2,2,2};
        System.out.println(sum28(arr));

    }
    public static Boolean  sum28(int[] arr ){
        int sum =0;
        for (int i=0 ;i<arr.length;i++){

            if(arr[i]==2){
                sum+=arr[i];
            }
            if (sum==8){
                return true;
            }
        }
        return false;

    }
}
