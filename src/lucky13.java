public class lucky13 {
    public static void main(String[] args) {
        System.out.println(lucky13(new int[]{1,2,4}));
        System.out.println(lucky13(new int[]{1,2,3}));
        System.out.println(lucky13(new int[]{2,2,4}));

    }
    public static Boolean  lucky13(int[] arr){
        for (int i=0; i<arr.length;i++){
            if (arr[i]==1 || arr[i]==3){
                return false;
            }
        }
        return true;
    }
}
