package Quiz;

public class EvenOddCount {
    public static void main(String[] args) {
        int[] numbers={12,13,14,46,13,18,11};
        int even=0;
        int odd=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Total Even Number :"+""+even);
        System.out.println("Total odd Number :"+""+odd);
    }
}
