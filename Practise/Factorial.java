package Practise;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter Number To Finf the Factorial");
        int number=sc.nextInt();
        int sum=1;
        for(int i=1;i<=number;i++){
            sum=sum*i;
            System.out.println(sum);
        }
        System.out.println(sum);
        }
    }
}
