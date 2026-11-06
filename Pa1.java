import java.util.Scanner;

public class Pa1 {
    
    public static void checkNumber() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter First Number");
            int x = sc.nextInt();
            System.out.println("Enter Second Number");
            int y = sc.nextInt();
            System.out.println("Enter Third Number");
            int z = sc.nextInt();
            if (x > y && x > x) {
                System.out.println("x is greater");
            } else if (y > z && y > z) {
                System.out.println("y is greater");
            } else {
                System.out.println("z is greater");
            }
        }
    }
    public static void leap(){
         try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter year to check");
        int a=sc.nextInt();
        if(a%4==0 && a%100!=0 && a%400==0){
            System.out.println("Leap year");
        }else{
            System.out.println("Not a leap year");
        }
         }
    }
    public static void mul(){
         try (Scanner sc = new Scanner(System.in)) {
            int b=sc.nextInt();
            for(int i=1;i<=10;i++){
                System.out.println(b+"*"+i+"="+b*i);
            }
         }
         }
         
      
           
         
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter Number You want to check");
            int n = sc.nextInt();
            if (n % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }

}