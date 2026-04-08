public class no14 {
    public static void main(String[] args) {
        System.out.println(no14(new int[]{1, 4, 5}));
        System.out.println(no14(new int[]{2, 2, 2}));

    }
    public static Boolean  no14(int[] arr) {
        {
            boolean has1 = false;
            boolean has4 = false;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) has1 = true;
                if (arr[i] == 4) has4 = true;
            }


            if (has1 && has4) return false;
            return true;
        }
    }}