package Quiz;

public class ArraySumAverage {
    public static void main(String[] args) {
        int[] arr={12,14,16,18,20};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];


        }
        //Sum Of Array
        System.out.println(sum);
        //average Of array
        float average=sum/arr.length;
        System.out.println(average);
    }
}
