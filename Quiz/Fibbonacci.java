package Quiz;

import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        System.out.println("Enter Number To find out the fibbonacco Series");
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            if(n<0){
                System.out.println("Invalid number :Number Can not Be Negative");
                return ;
            }
            if(n==0){
                System.out.println("No Number is to display");
                return ;
            }
            if(n==1){
                System.out.println("0");
                return ;
            }
            int firstNum=0;
            int secondNum=1;
            for(int i=1;i<=n;i++){
               System.out.println(firstNum+"");
               int next=firstNum+secondNum;
               firstNum=secondNum;
               secondNum=next;
               
            }
        }
    }
}
