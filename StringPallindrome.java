public class StringPallindrome {
    public static void main(String[] args) {
        // String str="rececar";

     
        int num=1234321;
        int rev=0;
        int number=num;
        while(num>0){
            int rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        if(number==rev){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not pallindrome");
        }
    }
}
