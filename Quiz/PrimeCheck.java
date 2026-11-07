package Quiz;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        
    try(Scanner sc=new Scanner(System.in)){
    System.out.println("Enter A number to check");
    int num=sc.nextInt();
    for(int i=2;i<=Math.sqrt(num);i++){
        if(num%i==0){
            System.out.println("Not A prime Number");
        }else{
            System.out.println("Prime Number");
        }
    }
    }
    }

}
