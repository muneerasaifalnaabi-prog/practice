public class fizzArray {
    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(fizzArray(4)));
        System.out.println(java.util.Arrays.toString(fizzArray(1)));

    }
    public static int[]  fizzArray(int n){
        int[] arr =new  int[n];
        for (int i=0; i<n;i++){
            arr[i]=i;
        }
        return arr;
    }
}
