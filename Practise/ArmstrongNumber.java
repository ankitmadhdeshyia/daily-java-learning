package Practise;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Number to Check");
            int number = sc.nextInt();
            int originalNumber = number;
            int newNumber = 0;
            // let a=123
            while (number > 0) {
                int rem = number % 10;
                // rev=(rev*10)+rem;
                int result = rem * rem * rem;
                newNumber = newNumber + result;
                number = number / 10;
            }
            if (originalNumber == newNumber) {
                System.out.println("Pallindrome");
            } else {
                System.out.println("Not pallindrome");
            }

        }
    }
}
