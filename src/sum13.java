public class sum13 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,19,45,78};
        System.out.println(sum13(arr));

    }
    public static int sum13(int [] arr){
        int sum =0;
        for (int i=0; i<arr.length;i++){
            if(arr[i]==13){
                continue;
            }
            sum+=arr[i];

        }
       return sum;
    }
}
