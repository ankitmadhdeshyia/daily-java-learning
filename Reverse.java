// import java.lang.reflect.Array;
// import java.util.Arrays;



public class Reverse {
    public static void main(String[] args) {
        //  int []arr={12,14,16,11,18,8};
        //  for(int i=arr.length-1;i>=0;i--){
        //     System.out.print(arr[i]+",");
        //  }
        // int left=0;
        // int right=arr.length-1;
        // while(left<right){
        //     int temp=arr[left];
        //     arr[left]=arr[right];
        //     arr[right]=temp;
        //     left++;
        //     right--;
      
        // }
        // int left=0;
        // int right=arr.length-1;
        // //Stroe 5
        // while(left<right){

        //     int temp=arr[left];
        //     //temp=0    
        //     arr[left]=arr[right];
        //     //left=0;    5
        //     arr[right]=temp;
        //     //right=5;   0
        //     left++;
        //     right--;
        // }
        // System.out.println(Arrays.toString(arr));

        //  String str="ankitGupta";
        //  for(int i=str.length()-1;i>=0;i--){
        //     char ab=str.charAt(i);
        //      System.out.print(ab);
        //  }
    //    String str="Ankit Madhdeshyia";
    //    String reverse=new StringBuilder(str).reverse().toString();
    //    System.out.println(reverse);      
    String str="Ankit Madhdeshyia";
    StringBuilder stri=new StringBuilder();
    for(int i=str.length()-1;i>=0;i--){
        stri.append(str.charAt(i));

    }
    String result=stri.toString();
    System.out.println(result);
    }

}
