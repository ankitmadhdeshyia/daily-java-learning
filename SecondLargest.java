public class SecondLargest {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        int secondLargest=0;
        int []arr={12,14,16,11,18,8};
        for(int i=0;i<arr.length;i++){
           if(max<arr[i]){

               secondLargest=max;
            max=arr[i];
           }else if(arr[i]>secondLargest){
          secondLargest=arr[i];
           }

        }
        System.out.println(secondLargest);
    }
}
