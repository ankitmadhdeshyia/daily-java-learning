package Practise;

public class Array {
    public static void main(String[] args) {
        int[] numbers = { 3, 4, 5, 6, 7, 8, 9 };

    float sum = 0;
    for (float n : numbers) {
      sum = sum + n;

      System.out.println("Sum of the array is: " + sum);

      for (int m : numbers) {
        if (m == 5) {
          System.out.println("The number is found in the array");
          return;
        }
      }

      System.out.println("The number is not found in the array");
      int[] marks = { 39, 65, 56, 67, 78 };
      int summ = 0;
      for (int mark : marks) {
        summ = summ + mark;
      }
      float average = summ / marks.length;
      System.out.println("Average marks of the student is: " + average);
      int[] arr = { 1, 2, 3, 4, 5 };
      for (int i = arr.length - 1; i >= 0; i--) {
        System.out.println(arr[i]);
      }
      int[] arrr = { 13, 2, 3, 4, 5, 9, 11, 12, 7, 6 };

      int max = arrr[0];
      for (int i = 1; i < arrr.length; i++) {
        if (arrr[i] < max) {
          max = arr[i];
        }
      }
      System.out.println("The minimum number in the array is: " + max);
    }
    }
}
