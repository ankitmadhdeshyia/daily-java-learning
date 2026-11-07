// import java.lang.reflect.Array;
// import java.util.Arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        //Reversing An Array using For Loop
        int[] arr = { 12, 14, 16, 11, 18, 8 };
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + ",");
        }
         //Reversing An Array using swapping 
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

        }
        System.out.println(Arrays.toString(arr));
        
       
 // reversing Array using String Builder with Build In Method
        String strin="String Builder";
        String reverse=new StringBuilder(strin).reverse().toString();
        System.out.println(reverse);

        // reversing Array using String Builder
        String str = "Ankit Madhdeshyia";
        StringBuilder stri = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            stri.append(str.charAt(i));
        }
        String result = stri.toString();
        System.out.println(result);

        //reversing A Integer Number
         int num=1234;
         int rev=0;
         while(num>0){
            int rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;


         }
         System.out.println(rev);
    }

}
