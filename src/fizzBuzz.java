public class fizzBuzz {
    public static void main(String[] args) {
       int start =10;
       int end =20 ;
       String[] arr =fizzBuzz(start,end);
        for (String n : arr) {
            System.out.print(n + " ");
        }

    }


    public static String[] fizzBuzz(int start ,int end){
       String[] arr =new String[end-start];
        for (int i = start; i < end; i++) {
            if (i % 15 == 0) {
                arr[i - start] = "FizzBuzz";
            } else if (i % 3 == 0) {
                arr[i - start] = "Fizz";
            } else if (i % 5 == 0) {
                arr[i - start] = "Buzz";
            } else {
                arr[i - start] = i+"";
            }
        }

        return arr;
    }

    }

