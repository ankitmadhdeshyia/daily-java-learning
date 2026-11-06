public class Pallindrome {
    public static void main(String[] args) {
        int number=123454321;
        int originalNumber=number;
        int reverse=0;
        while(number>0){
           reverse=(reverse*10)+(number%10);
           number=number/10;

        }
        if(reverse==originalNumber){
            System.out.println("pallindrome");
        }else{
            
            System.out.println("Not Pallindrome");
        }
    }

}
